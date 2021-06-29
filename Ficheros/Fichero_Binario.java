package Ficheros;
import java.io.*;


public class Fichero_Binario {
	
	 public static void main(String[] args) {
		 
	 
		 String nombreFichero ="C:\\Users\\Álvaro Velázquez\\Desktop//Binario.txt";
		 try {
			 
		 FileOutputStream ficheroSalida = new FileOutputStream(nombreFichero);
		 ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
		 
		 // escritura de los objetos en el fichero
		 objetoSalida.writeObject(new Persona("55287188B", "María", "Ruiz Ramos"));
		 objetoSalida.writeObject(new Persona("40302010A", "Juan", "González López"));
		 objetoSalida.close();
		 
		 // lectura de los objetos almacenados en el fichero
		 FileInputStream ficheroEntrada = new FileInputStream(nombreFichero);
		 ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
		 
		 Persona p1 = (Persona)objetoEntrada.readObject();
		 Persona p2 = (Persona)objetoEntrada.readObject();
		 objetoEntrada.close();
		 
		// muestra los objetos del fichero por la consola
		 System.out.println("DNI\t Nombre");
		 System.out.println(p1.getDatos());
		 System.out.println(p2.getDatos());
		 
		 } catch (FileNotFoundException e) {
			 
		 System.out.println("¡El fichero no existe!");
		 
		 } catch (IOException e) {
			 
		 System.out.println(e.getMessage());
		 
		 } catch (Exception e) {
			 
		 System.out.println(e.getMessage());
		 
		 };
		 }
		
}
