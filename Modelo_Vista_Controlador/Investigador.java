package Modelo_Vista_Controlador;

import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class Investigador {
	
	 private String nif;
	 private String nombre;
	 private String apellidos;
	 private LocalDate fechaContratacion;
	 private double retribucion;
	 
	 public Investigador(String nif, String nombre, String apellidos,LocalDate fechaContratacion, double retribucion) {
		 
		 this.nif = nif;
		 this.nombre = nombre;
		 this.apellidos = apellidos;
		 this.fechaContratacion = fechaContratacion;
		 this.retribucion = retribucion;
		 
	 }
	 
	 public String getNIF() {
		 return this.nif;
	 }
	 public String getNombre() {
		 return this.nombre;
	 }
	 public String getApellidos() {
		 return this.apellidos;
	 }
	 public LocalDate getFechaContratacion() {
		 return this.fechaContratacion;
	 }
	 
	 public int getAntigüedad() {
		 
		 return (LocalDate.now().getYear() -this.fechaContratacion.getYear());
	 }

	public double getRetribucion() {
		 return this.retribucion;
	}
	
	abstract public double getSubidaSalarial();
	
		public String getDatos() {
			
			 DecimalFormat df = new DecimalFormat("#.##");
			 
			 return this.nif + " " + this.apellidos + ", " + this.nombre +"\t" + this.getAntigüedad() + " años \t" + this.retribucion + " eur. " +
			 		Double.valueOf(df.format(this.getSubidaSalarial())) + " " + (this.getClass().getSimpleName().equals("InvestigadorTitular")
			 				? "Titular" : "Formacion");
			 
		}
	}




















