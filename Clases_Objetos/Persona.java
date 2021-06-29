package Clases_Objetos;


public class Persona {
	
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private int Dia;
	private int Mes;
	private int Year;
	private int Telefono;
	
	public Persona(String dNI, String nombre, String apellidos, int dia, int mes, int year, int telefono) {
		super();
		this.DNI = dNI;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Dia = dia;
		this.Mes = mes;
		this.Year = year;
		this.Telefono = telefono;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getDia() {
		return Dia;
	}

	public void setDia(int dia) {
		Dia = dia;
	}

	public int getMes() {
		return Mes;
	}

	public void setMes(int mes) {
		Mes = mes;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	
	
	public void getEdad() {
		int edad=0;
		edad = 2020 - Year;
		System.out.println("la edad del alumno es: " + edad);
		
	}

}
