package Prueba3;

import java.util.Vector;

public class Generico <T> {
	
	private Vector<T> Lista;
	private T dato;
	
	
	public Generico() {
		
		this.Lista = new Vector<T>();
		
	}
	
	
	public Generico(T dato) {
		
		this.dato = dato;
	}
	
	
	public T getDato() {
		
		return this.dato;
	}
	
	public void setDato(T dato) {
		
		this.dato = dato;
	}
	
	
	
	public void insertaPrimero(T e) {
		
		this.Lista.add(0, e);
	}
	
	public T eliminaPrimero() {
		
		if(!this.Lista.isEmpty()) {
			T e = this.Lista.get(0);
			this.Lista.removeElementAt(0);
			
			return e;
		}else {
			
			return null;
		}
	}
	
	 public String toString() {

		 String s = "{";
		 
		 for (T e : this.Lista)
		 s = s + e + ",";
		 
		 s = s + "}";
		 return s;

	 }

	
}
