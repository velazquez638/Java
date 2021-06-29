package NewAdapter;

public class AdaptadorObjeto implements IObjetoNuevo{

	private ObjetoAntiguo  Objeto;
	
	public AdaptadorObjeto (ObjetoAntiguo Objeto) {
		
		this.Objeto = Objeto;
		
	}
	

	public String getNombre() {
		
		return this.Objeto.getNombre();
	}
	
	public String getApellidos() {
		
		return this.Objeto.getNombre();
	}
	

	



}
