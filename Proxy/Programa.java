package Proxy;

//Proxy es un patr�n estructural que tiene como prop�sito proporcionar un subrogado o intermediario de un objeto para controlar su acceso.

public class Programa {
	
	public static void main (String args[]){
		
		 LlamadaTelefonica telefono;
		 
		 if ((int) (Math.random() * 100 % 2) == 0)
			 telefono = new Telefono();
		 else
			 telefono = new LlamadaTelefonicaProxy();
		 
		 telefono.llamar("+34656761209");
	}

}
