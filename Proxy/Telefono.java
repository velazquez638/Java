package Proxy;

public class Telefono implements LlamadaTelefonica {
	
	 @Override
	 public void llamar(String numero) {
		 
		 System.out.print("Llamando con el teléfono, ");
		 System.out.println("marcando el número " + numero);
	 }
}
