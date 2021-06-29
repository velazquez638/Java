package Prueba3;

public class Tread extends Thread{

	int coches = 0;
	String matricula;
	
	public Tread(int coches, String matricula) {
		super();
		this.coches = coches;
		this.matricula = matricula;
	}
	
	
	public void run() {
		
		for  (int i=0; i<coches; i++) {
			System.out.println("MAtricula del coche: " + matricula );
			break;
		}
	}
	
}
