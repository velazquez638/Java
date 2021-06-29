package Prueba;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main implements Funciones{

	ArrayList <Empleados> personal = new ArrayList<Empleados>();
	String idFichero = "C:\\Users\\Álvaro Velázquez\\Desktop//Personal.txt";
	
	
	
	
	public void mostrar() {
		
		System.out.println("Lista de empleados");
		for (int i=0; i<personal.size(); i++) {
			
			System.out.println("Nombre: " + personal.get(i).getNombre() + "\nedad: " + personal.get(i).getEdad() + "\ncorreo: " + personal.get(i).getCorreo()
					+ "\ntelefono: " + personal.get(i).getTelefono() + "\n");
		}
			
	}

	
	
	
	public void guardarFichero() throws FileNotFoundException {
		
		 
		 PrintWriter ficheroSalida = new PrintWriter(idFichero);
		 
		 for (int i=0; i<personal.size(); i++) {
			 
		     ficheroSalida.println("Nombre: " + personal.get(i).getNombre() + "\nedad: " + personal.get(i).getEdad() + "\ncorreo: " + personal.get(i).getCorreo()
						+ "\ntelefono: " + personal.get(i).getTelefono() + "\n");
		 }
		 
		 ficheroSalida.close();
	}

	
	
	
	
	public void mostrarFichero() throws FileNotFoundException {
		
		File ficheroEntrada = new File (idFichero);
		
		 if (ficheroEntrada.exists()) {
			 
		    Scanner datosFichero = new Scanner(ficheroEntrada);
		    System.out.println("\nDatos del fichero\n");
		 
		 while (datosFichero.hasNext()) {
			 
		    String [] personal = datosFichero.next().split(",");
		 
		    for (int i=0; i < personal.length; i++)
			 
		       System.out.print(personal[i]);
		       System.out.println("");
		 
		 }
		 
		 datosFichero.close();
		 
		 } else
			 
		 System.out.println("¡El fichero no existe!\n");
		 
		 }


	
	
	
	@SuppressWarnings("resource")
	public void añadir() {
    	
		Scanner rsc = new Scanner (System.in);
        Scanner rsc1 = new Scanner (System.in);

		String nombre;
		int edad;
		String correo;
		int telefono;
		
		System.out.println("introduzca su nombre");
		nombre = rsc.nextLine();
		System.out.println("introduzca su edad");
		edad = rsc.nextInt();
		System.out.println("introduzca su correo");
		correo = rsc1.nextLine();
		System.out.println("introduzca su telefono");
		telefono = rsc1.nextInt();
		
		personal.add(new Empleados (nombre, edad, correo, telefono));
	}

	
	
	
	public static void main(String[] args) throws FileNotFoundException {

		Scanner res = new Scanner(System.in);
		int respuesta = 0;
		Main j = new Main();
		
		while(respuesta!=5) {
			
			System.out.println("\n-1- añadir empleado");
			System.out.println("-2- mostrar empleado");
			System.out.println("-3- mostrar datos del fichero");

			respuesta = res.nextInt();
		
			switch(respuesta) {
			
			case 1:
				j.añadir();
				j.guardarFichero();
				break;
				
			case 2:
				j.mostrar();	
				break;
				
			case 3: 
				j.mostrarFichero();
				break;
				
			}
				
			
		}
		
	
	}


	
	



}
