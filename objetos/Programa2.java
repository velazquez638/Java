package objetos;

public class Programa2 {

	public static void main(String[] args) {
		Persona [] amigos = new Persona[5];
		
		Persona gonzalo = new Persona ("1", "Gonzalo", "Robledo", 24, 5, 1996, "671869415");
		Persona daniel = new Persona ("2", "Daniel", "Serrano", 20 , 8, 1994, "600378129");
		
		amigos[0]= gonzalo;
		amigos[1] = daniel;
		amigos[2] = new Persona ("3", "Luis", "Fernandez", 10, 2, 1995, "666777888");
		amigos[3]= new Persona ("4", "Alberto", "Ricardez", 5, 4, 1994, "777888999");
		amigos[4] = new Persona ("5", "Maria", "Gonzalez", 22, 3, 1999, "666999888");
		
		System.out.println ("\nMis amigos en ascendente\n");
		
		for (int i=0; i<amigos.length; i++) {
			System.out.println(amigos[i].getDatos());
		}

		System.out.println("\nMis amigos en descendente\n");
		
		for (int i=amigos.length -1; i>=0; i--) {
			System.out.println(amigos[i].getDatos());
		}
		
		
		
		System.out.println("\n Mis amigos (con FOR para todo)\n");
		
		for (Persona p: amigos)
			System.out.println(p.getDatos());
		
		System.out.println("\nMis amigos con 20 años\n");
		
		for (Persona p: amigos)
			if (p.getEdad()==20)
			System.out.println(p.getDatos());
		
		System.out.println ("\nMis aigos entre 24 y 25 años");
		
		for (Persona p: amigos)
			if ((p.getEdad() >= 24) && (p.getEdad() <=25))
			System.out.println(p.getDatos());
				
	}

}
