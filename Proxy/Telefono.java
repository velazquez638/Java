package Proxy;

public class Telefono implements LlamadaTelefonica {
	
	 @Override
	 public void llamar(String numero) {
		 
		 System.out.print("Llamando con el tel�fono, ");
		 System.out.println("marcando el n�mero " + numero);
	 }
}
