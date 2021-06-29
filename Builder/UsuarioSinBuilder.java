package Builder;

public class UsuarioSinBuilder {
	

	private String email;
	private String nombre;
	private int a�oNacimiento;
	private boolean activo;
	
	public UsuarioSinBuilder(String email) {
		
		this.email = email;
		this.nombre = "";
		this.a�oNacimiento = 0;
		this.activo = false;
		
	}
	
	
	public UsuarioSinBuilder(String email, String nombre) {
		
		this.email = email;
		this.nombre = nombre;
		this.a�oNacimiento = 0;
		this.activo = false;
		
	 }
	
	
	public UsuarioSinBuilder(String email, String nombre, int a�oNacimiento) {
		
		this.email = email;
		this.nombre = nombre;
		this.a�oNacimiento = a�oNacimiento;
		this.activo = false;
		
	}
	
	
	public UsuarioSinBuilder(String email, String nombre, int a�oNacimiento, boolean activo) {
		
		this.email = email;
		this.nombre = nombre;
		this.a�oNacimiento = a�oNacimiento;
		this.activo = activo;
	 }

}
