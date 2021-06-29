package Modelo_Vista_Controlador;

import java.time.LocalDate;

public class InvestigadorFormacion extends Investigador {
	
	 boolean extraordinario;
	 
	 public InvestigadorFormacion(String nif, String nombre,String apellidos, LocalDate fechaContratacion,double retribucion, boolean extraordinario) {
		 
		 super(nif, nombre, apellidos, fechaContratacion, retribucion);
		 
		 this.extraordinario = extraordinario;
	 }
	 
	 public boolean getExtraordinario() {
		 
		 return this.extraordinario;
		 
	 }
	 public double getSubidaSalarial() {
		 
		 double factor = 0.025 +((this.extraordinario) ? 0.01 : 0.0) +((super.getAntigüedad() >= 3) ? 0.01 : 0.0);
		 return (super.getRetribucion() * factor);
		 
	 }
	 
	 public String getDatos() {
		 
		 return super.getDatos() + ((this.extraordinario) ?" Extraordinario " : "");
		 
	 }
}
