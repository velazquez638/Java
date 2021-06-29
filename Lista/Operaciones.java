package Lista;

import java.util.ArrayList;

public class Operaciones {
	
	  ArrayList <String> Lista = new ArrayList<String>();
	
	//private static ArrayList<String>Lista;
	
	public Operaciones () {
		
		this.Lista = Lista;
	}

	
	public boolean vacia() {
		
		return this.Lista.isEmpty();
	}
	
	public void AñadirElemento(String elemento) {
		
		Lista.add(elemento);
		
	}
	
	public void EliminaElemento(String elemento) {
		
		Lista.remove(elemento);
	}
	
	public void InsertaPrimero(String elemento) {
		
		if(Lista.isEmpty()) {
			
			Lista.add(elemento);
			
		}else {
			
			Lista.add(0, elemento);
		}
	}
	
	public int Size() {
		
		return Lista.size();
		
	}
	
	public void InsertaUltimo(String elemento) {
		
		if(Lista.isEmpty()) {
			
			Lista.add(elemento);
		}else {
			
			Lista.add(Size(), elemento);
		}
	}
	
	public void eliminaPrimero() {
		
		Lista.remove(0);
	}
	
	public void eliminaUltimo() {
		
		Lista.remove(Size());
	}
	
	
	public void busca(String elemento) {
		
		if (Lista.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			
			for (int i=0; i<Size(); i++) {
				
				if (elemento == Lista.set(i, elemento)) {
					
					System.out.println("el elemento: " + elemento +" esta en la lista");
				}else {
					System.out.println("el elemento: " + elemento +" NO esta en la lista");
				}
			
			}
		
		}
		
	}
	
	public String toString() {

		 String s = "{";
		 
		 for (String e : this.Lista)
		 s = s + e + ",";
		 
		 s = s + "}";
		 return s;

	 }


	
}
