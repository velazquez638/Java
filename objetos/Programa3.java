package objetos;

import java.util.List;
import java.util.ArrayList;

public class Programa3 {
	
	
	
	public static String personasAno(List<Persona>lista, int ano) {
		String s= "\nMis amigos del ano " + ano + "\n\n";
		
		for (Persona p: lista)
			if (p.getAnoNacimiento()== ano)
				s = s + p.getNombre() + "\n";
		
		return s;
		
	}
	
	

	public static void main(String[] args) {
		
		List<Persona> amigos = new ArrayList<Persona>();
		
		amigos.add(new Persona ("1", "Carlos", "Martin", 20, 4, 1993, "677981234"));
		amigos.add(new Persona ("2", "Maria", "Morena", 12, 7, 1991, "645287841"));
		amigos.add(new Persona ("3", "Juan", "Sanchez", 2, 1, 1991, "652451212"));
		amigos.add(new Persona ("4", "Luis", "Espinosa", 10, 11, 1990, "641634198"));
		
		
		System.out.println("\n Mis amigos\n");
		
		
		for (int i=0; i<amigos.size();i++)
		System.out.println(amigos.get(i).getDatos());
		
		
		System.out.println (personasAno(amigos,1991));
		System.out.println(personasAno(amigos, 1990));
		
		List<Persona> clase = new ArrayList<Persona>();
		
		clase.add(new Persona ("1", "Carlos", "Martin", 20, 4, 1993, "677981234"));
		clase.add(new Persona ("2", "Maria", "Morena", 12, 7, 1991, "645287841"));
		clase.add(new Persona ("3", "Juan", "Sanchez", 2, 1, 1991, "652451212"));
		
		System.out.println("\nMis amigos de la clase ");
		
		for (Persona p: clase)
			System.out.println(p.getDatos());
		
		System.out.println(personasAno(clase,1993));

	}

}
