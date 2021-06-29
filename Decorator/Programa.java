package Decorator;

// el patron decorador responde a la necesidad de añadir dinamicamente funcionalidad a un objeto.
// Esto nos permite no tener que crear sucesivas clases que heredan de la primera incorporando la nueva funcionalidad, sino
// otras que la implementan y se asocian a la primera.

public class Programa {

	public static void main(String[] args) {
		
		 Mascota gato = new Gato("Félix");
		 Mascota perro = new Perro("Golfo");
		 
		 System.out.println(gato.getCaracteristicas());
		 System.out.println(perro.getCaracteristicas());
		 
		 Mascota perroNadador = new MascotaNadadora(perro);
		 System.out.println(perroNadador.getCaracteristicas());
		 
		 Mascota perroSaltador = new MascotaSaltadora(perro);
		 System.out.println(perroSaltador.getCaracteristicas());
		 
		 Mascota perroNadadorSaltador = new MascotaSaltadora(perroNadador);
		 System.out.println(perroNadadorSaltador.getCaracteristicas());
		 
		 Mascota gatoNadador = new MascotaNadadora(new Gato("Silvestre"));
		 System.out.println(gatoNadador.getCaracteristicas());
		 
		 }
	
}




