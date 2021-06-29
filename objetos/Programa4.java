package objetos;

import java.util.Vector;

public class Programa4 {

	public static void main(String[] args) {
		
		Vector<Persona> vecinos = new Vector<Persona>();
		
		vecinos.add(new Persona("5", "Maria", "Garcia", 3, 5, 1992, "66347518"));
		vecinos.add(new Persona("6", "Mario", "Benitez", 2, 10, 1992, "684251638"));
		vecinos.add(new Persona("7", "Pablo", "Miranda", 4, 2, 1991, "754821635"));
		
		System.out.println("Mis vecinos:\n");
		
		for(Persona p: vecinos)
			System.out.println(p.getDatos());

	}

}
