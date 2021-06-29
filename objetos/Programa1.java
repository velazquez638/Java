package objetos;

public class Programa1 {

	public static void main(String[] args) {
		
		Persona gonzalo = new Persona ("1", "Gonzalo", "Robledo", 24, 5, 1996, "671869415");
		Persona daniel = new Persona ("2", "Daniel", "Serrano", 20, 8, 1994, "674123651");
		
		System.out.println("El nombre almacenado en el objeto gonzalo es " + gonzalo.getNombre());
		System.out.println("El telefono almacenado en el objeto daniel es " + daniel.getTelefono());
		
		daniel.setTelefono("600378129");
		
		System.out.println("El nuevo telefono de daniel es " + daniel.getTelefono());
		
		System.out.println("");
		System.out.println(gonzalo.getDatos());
		System.out.println(daniel.getDatos());

	}

}
