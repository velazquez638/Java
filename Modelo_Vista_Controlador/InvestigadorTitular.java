
package Modelo_Vista_Controlador;
import java.time.LocalDate;

public class InvestigadorTitular extends Investigador {
	
	 private int sexenios;
	 
	 public InvestigadorTitular(String nif, String nombre,String apellidos, LocalDate fechaContratacion,double retribucion, int sexenios) {
		 
		 super(nif, nombre, apellidos, fechaContratacion, retribucion);
		 this.sexenios = sexenios;
	 
	 }
	 
	 public int getSexenios() {
		 
		 return this.sexenios;
		 
	 }
	 
	 public double getSubidaSalarial() {
		 
		 double factor = 0.035 + this.sexenios/100.0 +((super.getAntigüedad() >= 5) ? 0.01 : 0.0);
		 return (super.getRetribucion() * factor);
		 
	 }
	 public String getDatos() {
		 
	 	return super.getDatos() + " con " + this.sexenios + " sexenios";
	 }

}
