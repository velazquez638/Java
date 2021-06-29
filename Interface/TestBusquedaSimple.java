package Interface;

public class TestBusquedaSimple {


	public static void main(String[] args) {

		
		String [] nombres1 = { "Alvaro", "maria", "ines"};
		Object [] claves1  = {"321neptuno", 3521, "a_la_verga_23"};		
		
		BusquedaSimple b2 = new BusquedaSimple (nombres1, claves1);
		
	
		System.out.println("la clave de " + nombres1[0] + " es -> " + "("+b2.existe(nombres1[0])+ ")");
		System.out.println("la clave de " + nombres1[1] + " es ->" + "("+b2.existe(nombres1[1])+ ")");
		System.out.println("la clave de " + nombres1[2] + " es ->" + "("+b2.existe(nombres1[2])+ ")");
	}

}
