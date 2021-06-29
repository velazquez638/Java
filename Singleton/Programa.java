package Singleton;

//Su intención consiste en garantizar que una clase solo tenga una instancia y proporcionar un punto de acceso global a ella.
public class Programa {

	public static void main(String[] args) {
		
		CestaCompraSingleton cesta1, cesta2, cesta3;

		cesta1 = CestaCompraSingleton.getInstancia();
		
		cesta1.añadeProducto("Producto 1");
		cesta1.añadeProducto("Producto 2");
		cesta1.añadeProducto("Producto 3");
		
		System.out.println("contenido de la cesta 1 \n");
		System.out.println(cesta1.getProductos());

		
		cesta2 = CestaCompraSingleton.getInstancia();
		
		cesta2.añadeProducto("Producto 4");
		cesta2.añadeProducto("Producto 5");
		cesta2.añadeProducto("Producto 6");
		cesta2.añadeProducto("Producto 7");
		
		System.out.println("contenido de la cesta 2 \n");
		System.out.println(cesta2.getProductos());
		
		
		cesta3 = CestaCompraSingleton.getInstancia();
		
		cesta3.añadeProducto("Producto 8");
		cesta3.añadeProducto("Producto 9");
		
		System.out.println("contenido de la cesta 3 \n");
		System.out.println(cesta3.getProductos());
	

			
	}

}
