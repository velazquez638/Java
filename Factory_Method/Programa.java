package Factory_Method;

// consiste en utilizar una clase constructora, abstracta con unos cuantos metodos definidos

public class Programa {

	public static void main(String[] args) {
		
		Reloj r1 = RelojFactory.creaReloj(RelojFactory.RELOJ_12H);
		Reloj r2 = RelojFactory.creaReloj(RelojFactory.RELOJ_24H);
		
		System.out.println(r1.getHora());
		System.out.println(r2.getHora());
	}
}
