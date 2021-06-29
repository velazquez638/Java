package Iterator;

import java.util.ListIterator;
import java.util.Vector;

public class Programa {

	public static void main(String[] args) {
		

		Vector<String> vocales = new Vector<String>();
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		
		//estamos creando un iterador sobre el objeto vocales
		ListIterator<String> iterador = vocales.listIterator();
		
		
		//recorre el vector de principio a final
		while(iterador.hasNext()) {
			
			System.out.println(iterador.next()); //con el next extraemos el siguiente elemento
		 }
		
		 System.out.println("");
		 
		 //recorre el vector de atrás a alante
		 while(iterador.hasPrevious()) {
			 
			 System.out.println(iterador.previous()); //con el privious extraemos el elemento anterior
		 }
		 
	}

	
}
