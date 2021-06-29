package ObjetosBanco;

public class Cliente {

	private String Nif;
	private String Nombre;
	private String Apellidos;
	private int telefono;
	
	
	public Cliente(String nif, String nombre, String apellidos, int telefono) {
		super();
		Nif = nif;
		Nombre = nombre;
		Apellidos = apellidos;
		this.telefono = telefono;
	}


	public String getNif() {
		return Nif;
	}


	public void setNif(String nif) {
		Nif = nif;
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


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
	
}
