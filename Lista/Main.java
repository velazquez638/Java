package Lista;

import java.util.ArrayList;

public class Main extends Operaciones{

	public static void main(String[] args) {
		
		ArrayList <Operaciones> ListaNombres = new ArrayList<Operaciones>();
		
		Operaciones n1 = new Operaciones();

		n1.AņadirElemento("Alvaro");
		n1.AņadirElemento("Ana");
		ListaNombres.add(n1);
		
		

	}

}
