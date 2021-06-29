package Adaptar;

//se utiliza para tranformar una interfaz en otra, de tal modo que una clase que no pueda utilizar la primera,
//haga uso de ella a traves de la segunda

// --------------------partes que tiene:-----------------------------
//  Target: define una interfaz especifica del dominio que Client usa
//  Client: colabora con la conformación de objetos para la interfaz Target
//  Adaptee: define una interfaz existente que necesita adaptarse
//  Adapter adapta la interfaz de Adatee a la interfaz Target


public class Programa {

	public static void dibujaRectanguloTipo1(RectanguloTipo1 r) {
		
		 System.out.println("Rectangulo (" + r.getX() + ", " + r.getY() +") ancho " + r.getAncho() + ", alto " + r.getAlto());
		 
	}
	
	public static void dibujaRectanguloTipo2(RectanguloTipo2 r) {
		
		 System.out.println("Rectangulo (" + r.getX1() + ", " + r.getY1() +"), (" + r.getX2() + ", " + r.getY2() + ")");
		 
	}
	
	public static void main (String args[]){
		
		RectanguloTipo2 rectangulo = new Rectangulo2(5, 5, 125, 55);
		dibujaRectanguloTipo2(rectangulo);
		dibujaRectanguloTipo1(new RectanguloAdapter(rectangulo));
		
	}
	
}
