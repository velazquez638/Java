package InterfazGenericos;

public class Buffer <T> implements IBuffer<T>{

	private int primero;
	private int ultimo;
	private T[] datos;
	
	
	public Buffer(int primero, int ultimo, T[] datos) {
		
		super();
		this.primero = primero;
		this.ultimo = ultimo;
		this.datos = datos;
	}
	


	@Override
	public boolean vacio() {
		
		if(primero == 0 && ultimo == 0) 
			
			return true;
		
		else 
			
		return false;
	}

	@Override
	public void inserta(T e) {
		
		if(datos.length >= ultimo) {
			
		}
	/*
	 if (lista.size() >= tope) {
   		lista.add(objeto);
  	 } else {
   		throw new RuntimeException("no caben mas");
  	 }
	 */
		
	}

	@Override
	public T elimina() throws Exception {
		
		String name = null;
		
		for(int i=0; i<datos.length; i++) {
			
			if(name == datos[i]) {
				
				datos[i] = null;
			}else {
				
				System.out.println("el dato introducido es erroneo");
			}
			
		}
		
		return null;
	}

	@Override
	public int inicio() {
		
		int name = 0;
		primero = name;
	
		
		return 0;
	}
	
	@Override
	public int fin() {
		
		int name = 0;
		ultimo = name;
		
		return 0;
	}

	@Override
	public int sucesor(int p) {
		
		
		for (int i=0; i<datos.length; i++) {
		
			
			
		}
		
		return 0;
	}

	@Override
	public T elemento(int p) throws Exception {
		
		return null;
	}

}


















