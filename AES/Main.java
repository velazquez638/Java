package AES;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
	  
	    //Si quisiera encriptar un fichero de texto, lo haría con las siguientes lineas
		//el fichero es el que se genera del proyecto Prueba
		/*
		String contenido = new String(Files.readAllBytes(Paths.get("C:\\Users\\Álvaro Velázquez\\Desktop//Personal.txt")));
		System.out.println(contenido);
		 */   
		     
		String contenido = "tengo hambre";    
		final String secretKey = "estaeslaclave";
		
	
	    
	    String encryptedString = AES.encrypt(contenido, secretKey) ;
	    String decryptedString = AES.decrypt(encryptedString, secretKey) ;
	     
	    System.out.println("el mensaje que envio es: " + contenido + "\n");
	    System.out.println("el mensaje encriptado es: " + encryptedString + "\n");
	    System.out.println("el mensaje desencriptado es: " + decryptedString + "\n");
	}
}
