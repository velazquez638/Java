package Genericos2;
import java.util.Arrays;
import java.util.Vector;

public class Lista<T> {

	private Vector<T> lista;
	
	
	public Lista() {
		
		this.lista = new Vector<T>();

	 }
	
	 public void insertaPrimero(T e) {

		 this.lista.add(0, e);

	 }
	 
	 public T eliminaPrimero() {
	
		 if (!this.lista.isEmpty()) {
			 
			 T e = this.lista.get(0);
		     this.lista.removeElementAt(0);
		     
			 return e;
			 
		} else
			
			return null;

	 }
	 
	 public void insertaUltimo(T e) {
		 
		 this.lista.add(this.lista.size(), e);
		 
	 }
	 
	 public T eliminaUltimo() {

		 if (!this.lista.isEmpty()) {
			 T e = this.lista.get(this.lista.size() - 1);
			 this.lista.removeElementAt(this.lista.size() - 1);
			 return e;
			 
		}else
			return null;
		 
	 }
	 
	 public boolean vacia() {
		 
		 return this.lista.isEmpty();	 
	 }
	 
	 
	 	 
	 public String toString() {

		 String s = "{";
		 
		 for (T e : this.lista)
		 s = s + e + ",";
		 
		 s = s + "}";
		 return s;

	 }

}
