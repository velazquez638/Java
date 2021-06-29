package objetos;

public class Amigos {

	public static void main(String[] args) {
		
		Amigo gonzalo = new Amigo ("1", "Gonzalo", "Robledo", "684218451");
		Amigo luis = new Amigo ("2", "Luis", "Gonzalez", "851246851");
		
		System.out.println("Nombre primer objeto: " + gonzalo.getNombre());
		System.out.println("Apellido: " + gonzalo.getApellidos());
		System.out.println("Telefono: " + gonzalo.getTelefono());
		
		System.out.println("Nombre segundo objeto: " + luis.getNombre());
		
		gonzalo.setTelefono("741545426");
		
		System.out.println("Nuevo telefono de gonzalo: " + gonzalo.getTelefono());
		System.out.println("Nuevo telefono de gonzalo: " + gonzalo.getDatos());

	}

}
