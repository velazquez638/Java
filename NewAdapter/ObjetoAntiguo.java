package NewAdapter;

public class ObjetoAntiguo implements IObjetoAntiguo{

	String nombre;
	
	public ObjetoAntiguo(String nombre){
		
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
}
