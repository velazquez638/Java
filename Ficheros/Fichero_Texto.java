package Ficheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fichero_Texto {

	 public static void main(String[] args) throws FileNotFoundException {
		 
	 //	 Lectura de un fichero ya creado 
	 //fichero de texto creado en el escritorio
	 File ficheroEntrada = new File ("C:\\Users\\Álvaro Velázquez\\Desktop//Hola.txt");
	 
	 if (ficheroEntrada.exists()) {
		 
	 Scanner datosFichero = new Scanner(ficheroEntrada);
	 
	 while (datosFichero.hasNext()) {
		 
	 String linea = datosFichero.nextLine();
	 String [] informacionAlumno = linea.split(";");
	 
	 for (int i=0; i < informacionAlumno.length; i++)
		 
	 System.out.print(informacionAlumno[i] + "\t");
	 System.out.println("");
	 
	 }
	 
	 datosFichero.close();
	 
	 }else
		 
	 System.out.println("¡El fichero no existe!");
	 
	 }
	

}
