package Clase1;

import java.util.Scanner;

public class CadenaInvertida {
	
	
	@SuppressWarnings("resource")
	public static void ContadorVocales() {
		
		int contador=0;
		int contador2=0;
		Scanner src = new Scanner (System.in);
		String Palabra;
		System.out.print("Introduce una palabra \n");
		Palabra = src.nextLine();
		
		for(int i=0; i<Palabra.length();i++) {
			
			if ((Palabra.charAt(i)=='a') || (Palabra.charAt(i)=='e') || (Palabra.charAt(i)=='i') || (Palabra.charAt(i)=='o') ||
					(Palabra.charAt(i)=='u')){ 
				
				 contador++;
				 
			}else {
				
				contador2++;
			}
			   
	    }
		System.out.print("la palabra " + Palabra + " tiene: " + contador + " vocales y " + contador2 + " consonantes \n");

		//---------------------------------------------------------------------------------------------------------------------------------
		
		 int vocalA = 0, vocalE = 0, vocalI = 0, vocalO = 0, vocalU = 0;

	     for (int i = 0; i < Palabra.length(); i++) {
	    	 
	          switch (Character.toUpperCase(Palabra.charAt(i))) {
	          
	            case 'A':
	                vocalA++;
	                break;
	            case 'E':
	                vocalE++;
	                break;
	            case 'I':
	                vocalI++;
	                break;
	            case 'O':
	                vocalO++;
	                break;
	            case 'U':
	                vocalU++;
	                break;
	            default:
	                break;
	            }
	        }

	       if(vocalA !=0 && vocalE!=0 && vocalI!=0 && vocalO!=0 && vocalU!=0) {
	    	   
		        System.out.println("la palabra: " + Palabra + " Si tiene todas las vocales\n");

	       }else {
	    	   
	    	   System.out.println("la palabra: " + Palabra + " No tiene todas las vocales\n");
	       }
		
	}
	
	
	
	
	public static void Palindroma() {
		
		Scanner src = new Scanner (System.in);
		String Palabra;
		System.out.print("Introduce una palabra \n");
		Palabra = src.nextLine();
		
	
		
		String frase_minúscula = Palabra.toLowerCase(); 
		
		String frase_sin_espacios = "";
		
		String cadena_invertida = "";
		
		for (int i=0; i< frase_minúscula.length(); i++) {
			
			if (frase_minúscula.charAt(i) != ' ') 
				
				frase_sin_espacios = frase_sin_espacios + frase_minúscula.charAt(i);
					
		}
		
		
		for (int i = frase_sin_espacios.length()-1; i>0; i--) 
			
			cadena_invertida = cadena_invertida + frase_sin_espacios.charAt(i);
			
			

		if (frase_sin_espacios.equals(cadena_invertida)) {
			
			System.out.println("la palabra " + Palabra +" es palíndroma");
			
		}else {
			
			System.out.println("la palabra " + Palabra +" no es palíndroma");
			
		}
		 
        
		
	}
	

	public static void main(String[] args) {

		
		
		System.out.print("Primer caso, uso charAt para invertir " + "los caracteres, tambien puedo"
				+ " usar charAt para imprimir la letra que se encuentra en una posicion exacta");
		System.out.print("\n");
		String palabra = "Alvaro";
		
		for (int i=0; i<palabra.length(); i++) {
			
			System.out.print(palabra.charAt(i));
			
			
			
		}
		
		System.out.print("\n");
		System.out.print("letra en la posicion 4 -> " + palabra.charAt(3));
		
		System.out.print("\n");
		
		
		for (int i = palabra.length()-1; i>=0; i--) {
			
			System.out.print(palabra.charAt(i));

		}
		
		
		
		
		
		System.out.print("\n");

		System.out.print("toCharArray, realiza la misma funcion que charAt\n");

		char [] letras = palabra.toCharArray();
		
		for(int i=0; i<letras.length; i++) {
			
			System.out.print(letras[i]);

		}

		System.out.print(" \n");
		System.out.print(" \n");

		ContadorVocales();
		Palindroma();
		
		
	}

}
