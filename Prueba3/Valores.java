package Prueba3;

import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {

		Generico<String> i1 = new Generico<String>("Alvaro");
		
		System.out.println("El nombre es: " + i1.getDato());
		
		Generico<String> nombres = new Generico<String>();
		
		String nombre;
		String fuera;
		
		Scanner srt = new Scanner(System.in);
		
		
		System.out.println("Introduce tu nombre\n");
		nombre = srt.nextLine();
		nombres.insertaPrimero(nombre);
		System.out.println("tu nombre: " + nombres.toString());

		System.out.println("Introduce otro nombre\n");
		nombre = srt.nextLine();
		nombres.insertaPrimero(nombre);
		System.out.println("tu nombre: " + nombres.toString());
		
	

	}

}
