package NewAdapter;

public class ObjetoNuevo implements IObjetoNuevo{
	
	String nombre;
	String apellidos;
	
	public ObjetoNuevo(String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellidos = apellido;
		
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
	
	

}
