package Interface;

public class TestConjunto {

	public static void main(String[] args) {

		
		ConjuntoHasSet c1 = new ConjuntoHasSet();
		ConjuntoHasSet c2 = new ConjuntoHasSet();
		
		String nombre = "Alvaro";
		String nombre2 = "Maria";
		String nombre3 = "El Pepe";
		String nombre4 = "Imanol";
		
		c1.inserta(nombre);
		c1.inserta(nombre2);

		
		c2.inserta(nombre3);
		c2.inserta(nombre4);

		
		System.out.print("el conjunto c1 " + (c1.vacio() ? " esta vacio\n " : " no esta vacio") );
		System.out.print("\n");

		System.out.print("el conjunto c2 " + (c2.vacio() ? " esta vacio\n " : " no esta vacio") );
		System.out.print("\n");


	    System.out.println(nombre + " " + (c1.contiene(nombre)? " esta en c1 " : "no esta en c1"));
	    System.out.println(nombre2 + " " + (c1.contiene(nombre2)? " esta en c1 " : "no esta en c1"));
		System.out.print("\n");
		System.out.print("\n");

		System.out.print("el conjunto c2 " + (c2.vacio() ? " esta vacio\n " : " no esta vacio") );
		System.out.print("\n");
		System.out.print("el conjunto c2 " + (c2.vacio() ? " esta vacio\n " : " no esta vacio") );
		System.out.print("\n");

		System.out.println(nombre3 + " " + (c2.contiene(nombre3)? " esta en c2 " : "no esta en c1"));
	    System.out.println(nombre4 + " " + (c2.contiene(nombre)? " esta en c2 " : "no esta en c1"));
		System.out.print("\n");
		System.out.print("\n");
		
		
	
		

	}

}
