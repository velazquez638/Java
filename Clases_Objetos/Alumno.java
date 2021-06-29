package Clases_Objetos;

public class Alumno extends Persona{

	private String Grado;
	
	
	public Alumno(String dNI, String nombre, String apellidos, int dia, int mes, int year, int telefono, String grado) {
		super(dNI, nombre, apellidos, dia, mes, year, telefono);
		// TODO Auto-generated constructor stub
		
		this.Grado = grado;
	}


	public String getGrado() {
		return Grado;
	}


	public void setGrado(String grado) {
		Grado = grado;
	}
	
	

}
