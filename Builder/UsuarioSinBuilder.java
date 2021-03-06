package Builder;

public class UsuarioSinBuilder {
	

	private String email;
	private String nombre;
	private int aņoNacimiento;
	private boolean activo;
	
	public UsuarioSinBuilder(String email) {
		
		this.email = email;
		this.nombre = "";
		this.aņoNacimiento = 0;
		this.activo = false;
		
	}
	
	
	public UsuarioSinBuilder(String email, String nombre) {
		
		this.email = email;
		this.nombre = nombre;
		this.aņoNacimiento = 0;
		this.activo = false;
		
	 }
	
	
	public UsuarioSinBuilder(String email, String nombre, int aņoNacimiento) {
		
		this.email = email;
		this.nombre = nombre;
		this.aņoNacimiento = aņoNacimiento;
		this.activo = false;
		
	}
	
	
	public UsuarioSinBuilder(String email, String nombre, int aņoNacimiento, boolean activo) {
		
		this.email = email;
		this.nombre = nombre;
		this.aņoNacimiento = aņoNacimiento;
		this.activo = activo;
	 }

}
