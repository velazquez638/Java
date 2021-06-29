package Facade;

//Facade -> fachada, es un tipo de patron estructural, viene motivado por la necesidad de estructurar un entorno de programacion
// y reducir su complejidad con la division en subsistemas, minimizando las comunicaciones y dependencias entre estos.


public class Programa {
	
	public static void main(String args[]) {
		
		 EmpresaFranquiciadora e = new EmpresaFranquiciadora();
		 System.out.println(e.getCosteHamburgueseria());
		 System.out.println(e.getCosteCafeteria());
		 System.out.println(e.getCostePizzeria());
	}

}
