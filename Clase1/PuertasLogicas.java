package Clase1;

import java.util.Scanner;

public class PuertasLogicas {

	
	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int respuesta=0;
		
		while (respuesta != 4) {
			
			@SuppressWarnings("resource")
			Scanner res = new Scanner(System.in);
			
			System.out.println("selecione una opcion");
			System.out.println("-1- AND");
			System.out.println("-2- OR");
			System.out.println("-3- NOT");
			
			respuesta = res.nextInt();

			switch(respuesta) {
			
			case 1:
				
				System.out.println(" variables: " + " a= " + a + " b= " + b);

				System.out.println("Operacion AND");
				int c = a * b;
				System.out.println(" a AND b = " + c);
				
				System.out.println("" );
				
				break;
				
			case 2:
				
				System.out.println(" variables: " + " a= " + a + " b= " + b);
				
				System.out.println("Operacion OR");
				int r = a + b;
				System.out.println(" a OR b = " + r);
				
				System.out.println("" );
				
				break;
				
			case 3:
				
				System.out.println(" variables: " + " a= " + a + " b= " + b);
				
				System.out.println("Operacion NOT");
				
				a = b;
				b = a-1;
				System.out.println(" NOT de a = " + a);
				System.out.println(" NOT de b = " + b);

				
				System.out.println("" );
				
				break;
				



			}
			
		}
		 
		
		
		
	}

}
