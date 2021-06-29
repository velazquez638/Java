package Ficheros;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Ficheros_Texto_2 {

	
	 public static void main(String[] args) throws IOException {
		 
	 // array numbers enters
	 int[][] numeros = { { 1, 2, 3, 4, 5},
	                     { 6, 7, 8, 9, 10},
	                     {11, 12, 13, 14, 15},
	                     {16, 17, 18, 19, 20},
	                     {21, 22, 23, 24, 25}};
	 
	 // escritura en el fichero de texto
	 
	 String idFichero = "C:\\Users\\Álvaro Velázquez\\Desktop//Numeros.txt";
	 PrintWriter ficheroSalida = new PrintWriter(idFichero);
	 
	 for (int i=0; i<numeros.length; i++) {
	 for (int j=0; j<numeros[i].length; j++)
	 ficheroSalida.print(numeros[i][j] + ",");

	 ficheroSalida.println("");
	 }
	 ficheroSalida.close();
	 
	// lectura del fichero de texto "numeros2.txt"
	 
	 File ficheroEntrada = new File (idFichero);
	 
	 if (ficheroEntrada.exists()) {
		 
	 Scanner datosFichero = new Scanner(ficheroEntrada);
	 System.out.println("Números del fichero \n");
	 
	 while (datosFichero.hasNext()) {
		 
	 String []numerosFichero = datosFichero.next().split(",");
	 
	 for (int i=0; i < numerosFichero.length; i++)
		 
	 System.out.print(numerosFichero[i] + "\t");
	 System.out.println("");
	 
	 }
	 
	 datosFichero.close();
	 
	 } else
		 
	 System.out.println("¡El fichero no existe!");
	 
	 }
	}
