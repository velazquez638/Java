package Concurrencia;

public class Banco {
	
	 public static void main(String[] args) {
		 // el saldo inicial de la cuenta es 100 euros
			 
		 Cuenta cuenta = new Cuenta(0);
		 // dos procesos de dep�sito que realizan 5 abonos de 10 euros
		 // dos procesos de retiro que realizan 5 cargos de 10 euros
		 
		 Thread[] procesos = new Thread[4];
		 procesos[0] = new Deposito(cuenta, 5, 100.0);
		 procesos[1] = new Retiro(cuenta, 2, 10.0);
		 procesos[2] = new Deposito(cuenta, 1, 20.0);
		 procesos[3] = new Retiro(cuenta, 3, 10.0);
		 
		 for(int i = 0; i < procesos.length; i++) {
			 procesos[i].start();
		 }
	
		 for(int i = 0; i < procesos.length; i++) {
			 
			 try {
				 procesos[i].join();
				 
			 } catch(InterruptedException ie) {
				 
				 System.err.println(ie.getMessage());
				 
			 } finally {
				 System.out.println("finaliza la transacci�n "+ (i+1));
			 }
		 }
	
		 System.out.println("el saldo final " + cuenta.getSaldo() + " eur.");
	 }
}
