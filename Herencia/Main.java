package Herencia;

public class Main {
	
	  public static void main(String[] args) {

	        Perro perro = new Perro("Teddy","Croquetas",10,"Chihuahua");
	        Gato gato = new Gato("Pelusa","Especial",8,"Siames");
	        Caballo caballo = new Caballo("Jhonny","Pasto",21,"Fino");

	        //-->Nos muestra los detalles del objeto
	        System.out.println("Soy: " + perro.getNombre());
	        perro.mostrar();
	        System.out.println("--------------------------------------------------");
	        System.out.println("Soy: " + gato.getNombre());
	        gato.mostrar();
	        System.out.println("--------------------------------------------------");
	        System.out.println("Soy: " + caballo.getNombre());
	        caballo.mostrar();

	    }

}
