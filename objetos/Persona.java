package objetos;

import java.util.Calendar;

public class Persona {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int diaNacimiento;
	private int mesNacimiento;
	private int anoNacimiento;
	private String telefono;
	
	
	public Persona (String dni, String nombre, String apellidos, int diaNacimiento, int mesNacimiento, int anoNacimiento, String telefono ) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.anoNacimiento = anoNacimiento;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDiaNacimiento() {
		return diaNacimiento;
	}

	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}

	public int getMesNacimiento() {
		return mesNacimiento;
	}

	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}

	public int getAnoNacimiento() {
		return anoNacimiento;
	}

	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDatos () {
		return this.dni + "  " + this.nombre + " " +this.apellidos + " \t " + this.telefono + "  " + this.getEdad() + " anos";
	}

	public int getEdad() {
		return calculaEdad(this.diaNacimiento, this.mesNacimiento, this.anoNacimiento);
	}
	
	public static int calculaEdad(int diaNacimiento, int mesNacimiento, int anoNacimiento) {
		int diaHoy, mesHoy, anoHoy, edad = 0;
	
	diaHoy= Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	mesHoy= Calendar.getInstance().get(Calendar.MONTH);
	anoHoy = Calendar.getInstance().get(Calendar.YEAR);
	
	if ((mesHoy > mesNacimiento) || ((mesHoy == mesNacimiento) && diaHoy >= diaNacimiento))
		edad = anoHoy - anoNacimiento;
	else
		edad = anoHoy - anoNacimiento - 1;

	return edad;
		
	}
	
	
	public static void main(String[] args) {
		
		Persona sabrina= new Persona ("87656856G", "VELAX", "ALVARO", 9, 10, 1998, "76567557858");
		
		System.out.println (sabrina.getDatos());
		System.out.println(sabrina.getEdad());

	}
	
	
	
	

}
