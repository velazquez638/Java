package Builder;

public class Usuario {

	private String email;
	private String nombre;
	private int añoNacimiento;
	private boolean activo;
	 // método constructor
	
	private Usuario(UsuarioBuilder usuario) {
		
		this.email = usuario.email;
		this.nombre = usuario.nombre;
		this.añoNacimiento = usuario.añoNacimiento;
		this.activo = usuario.activo;
		
	}
	
	public String getEmail() {
		
		return this.email;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getAñoNacimiento() {
		return this.añoNacimiento;
	}
	
	public boolean getActivo() {
		return this.activo;
	}
	
	public String getDatos() {
		return this.email + "\t" + this.nombre + "\t" + ((this.añoNacimiento != 0) ? this.añoNacimiento : "????") + "\t" + ((this.activo) ? "activo" : "inactivo");
	 }
	
	
	public static class UsuarioBuilder {

		 private String email;
		 private String nombre;
		 private int añoNacimiento;
		 private boolean activo;
		 // constructor para los atributos obligatorios: nombre del usuario, email
		 
		 public UsuarioBuilder(String nombre, String email) {
			 
			 this.nombre = nombre;
			 this.email = email;
		 }
		 
		 // métodos set para los atributos opcionales del constructor:
		 // añoNacimiento, activo
		 
		 public UsuarioBuilder setAñoNacimiento(int añoNacimiento) {
			 
			 this.añoNacimiento = añoNacimiento;
			 return this;
		 }
		 
		 public UsuarioBuilder setActivo(boolean activo) {
			 
			 this.activo = activo;
			 return this;
		 }
		 
		 // método build con validación para garantizar que la instancia
		 // almacena datos correctos
		 
		 public Usuario build() {
			 
			 Usuario usuario = new Usuario(this);
			 
			 if (usuario.añoNacimiento > 2000)
				 throw new IllegalArgumentException("El usuario '" + usuario.nombre + "' debe ser mayor de edad");
			 
			 return new Usuario(this);
			 
		 }

	}

}


