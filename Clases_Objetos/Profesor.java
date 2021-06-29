package Clases_Objetos;

public class Profesor extends Persona{
	
	

	private int Titulacion_Year;
	
	public Profesor(String dNI, String nombre, String apellidos, int dia, int mes, int year, int telefono, int titulacion_year) {
		super(dNI, nombre, apellidos, dia, mes, year, telefono);
		
		this.Titulacion_Year = titulacion_year;
	}


	public int getTitulacion_Year() {
		return Titulacion_Year;
	}

	public void setTitulacion_Year(int titulacion_Year) {
		Titulacion_Year = titulacion_Year;
	}

	
}
