package Interface;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHasSet implements Conjunto{

	private Set <String> conjunto;
	
	public ConjuntoHasSet() {
		this.conjunto = new HashSet<String>();
		
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

*/
	public boolean vacio() {
		return this.conjunto.isEmpty();
	}


	public void inserta(String clave) {
		
	  this.conjunto.add(clave);
	  
	}


	public boolean contiene(String clave) {
		
		return this.conjunto.contains(clave);
		
	}


	public void inicializa() {

		this.conjunto.clear();
	}

}
