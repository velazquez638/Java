package Interface;

public class BusquedaSimple implements Busqueda{

	
	private String [] nombres;
	private Object [] claves;
	

	public BusquedaSimple(String [] nombres, Object [] claves) {
		
		this.nombres = nombres;
		this.claves= claves;
	}
	

	
	@Override
	public Object existe(String nombre) {
	
		for(int i = 0; i<nombres.length; i++) 
			
			if(nombres[i].equals(nombre))
				return claves[i];
	
		
		
		return null;
	}

}
