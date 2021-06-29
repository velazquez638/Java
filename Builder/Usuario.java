package Builder;

public class Usuario {

	private String email;
	private String nombre;
	private int a�oNacimiento;
	private boolean activo;
	 // m�todo constructor
	
	private Usuario(UsuarioBuilder usuario) {
		
		this.email = usuario.email;
		this.nombre = usuario.nombre;
		this.a�oNacimiento = usuario.a�oNacimiento;
		this.activo = usuario.activo;
		
	}
	
	public String getEmail() {
		
		return this.email;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getA�oNacimiento() {
		return this.a�oNacimiento;
	}
	
	public boolean getActivo() {
		return this.activo;
	}
	
	public String getDatos() {
		return this.email + "\t" + this.nombre + "\t" + ((this.a�oNacimiento != 0) ? this.a�oNacimiento : "????") + "\t" + ((this.activo) ? "activo" : "inactivo");
	 }
	
	
	public static class UsuarioBuilder {

		 private String email;
		 private String nombre;
		 private int a�oNacimiento;
		 private boolean activo;
		 // constructor para los atributos obligatorios: nombre del usuario, email
		 
		 public UsuarioBuilder(String nombre, String email) {
			 
			 this.nombre = nombre;
			 this.email = email;
		 }
		 
		 // m�todos set para los atributos opcionales del constructor:
		 // a�oNacimiento, activo
		 
		 public UsuarioBuilder setA�oNacimiento(int a�oNacimiento) {
			 
			 this.a�oNacimiento = a�oNacimiento;
			 return this;
		 }
		 
		 public UsuarioBuilder setActivo(boolean activo) {
			 
			 this.activo = activo;
			 return this;
		 }
		 
		 // m�todo build con validaci�n para garantizar que la instancia
		 // almacena datos correctos
		 
		 public Usuario build() {
			 
			 Usuario usuario = new Usuario(this);
			 
			 if (usuario.a�oNacimiento > 2000)
				 throw new IllegalArgumentException("El usuario '" + usuario.nombre + "' debe ser mayor de edad");
			 
			 return new Usuario(this);
			 
		 }

	}

}


