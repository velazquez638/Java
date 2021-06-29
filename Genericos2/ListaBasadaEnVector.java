package Genericos2;

public class ListaBasadaEnVector {

	public static void main(String[] args) {

		Lista<Integer> numeros = new Lista<Integer>();
		numeros.insertaPrimero(2);
		numeros.insertaUltimo(4);
		numeros.insertaUltimo(6);
		numeros.insertaPrimero(0);
		numeros.insertaUltimo(34);
		System.out.println("Lista " + numeros.toString());
		System.out.println("Borramos el último: ");
		numeros.eliminaUltimo();
		System.out.println("Lista " + numeros.toString());
		


		
		Lista<String> nombres = new Lista<String>();
		nombres.insertaPrimero("alvaro");
		nombres.insertaPrimero("Ana");
		nombres.insertaUltimo("nacho");
		nombres.insertaUltimo("atenea");
		System.out.println("Lista de nombres: " + nombres.toString() );
	

	}

}
