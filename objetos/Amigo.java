package objetos;

public class Amigo {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private String telefono;
	
	public Amigo (String dni, String nombre, String apellidos, String telefono) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
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
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDatos() {
		return this.dni + "  " + this.apellidos + " \t " + this.telefono + "  ";
	}

	
	
}
