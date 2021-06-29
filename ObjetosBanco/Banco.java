package ObjetosBanco;
import java.util.Scanner;
import java.util.Vector;

public class Banco {
	
	Vector <Cliente> clientes =new Vector<Cliente>();
	Vector <Cuenta> cuentas = new Vector <Cuenta>();
	
	
	public void altaCliente(Cliente c) {
		
		@SuppressWarnings("resource")
		Scanner src = new Scanner (System.in);
		String Nif;
		String Nombre;
		String Apellidos;
		int Telefono;
		
		System.out.println("introduce NIF:");
		Nif = src.nextLine();
		
		System.out.println("introduce Nombre:");
		Nombre = src.nextLine();
		
		System.out.println("introduce Apellidos:");
		Apellidos = src.nextLine();
		
		System.out.println("introduce Telefono:");
		Telefono = src.nextInt();
		
		clientes.add(new Cliente (Nif, Nombre, Apellidos, Telefono));
		
		
	}
	
	public void altaCuenta(Cuenta c) {
		
		Scanner src = new Scanner (System.in);
		String Numero;
		String Nif;
		float Saldo;
		
		System.out.println("introduce el Numero de cuenta:");
		Numero = src.nextLine();
		
		System.out.println("introduce Nif:");
		Nif = src.nextLine();
		
		System.out.println("introduce Saldo inicial:");
		Saldo = src.nextFloat();
		
		
		cuentas.add(new Cuenta (Numero, Nif, Saldo));
		cuentas.add(new Cuenta (Numero, Nif));
		
		
	}
	
	public void ingresoCuenta(String n, float c) {
		Scanner src = new Scanner (System.in);
		String Numero;
		float ingreso; 
		String Nif = null;
		float Saldo = 0;
		

		
		System.out.println("introduce el Numero de cuenta:");
		Numero = src.nextLine();
		
		for (int i=0; i<cuentas.size(); i++) {
			
			if(Numero == cuentas.get(i).getNumero()) {
				System.out.println("introduce ingreso");
				ingreso = src.nextFloat();
				cuentas.get(i).setSaldo(ingreso);
				
				Cuenta c1 = new Cuenta (Numero, Nif, (Saldo+ingreso));

			}
		}
		
		
		
	}
	
	public void retiroCuenta(String n, float c) {
		
		
	}
	
	public void consultaCuenta() {
		
		Scanner src = new Scanner (System.in);
		
		String Nif;
		System.out.println("introduce el Numero de cuenta:");
		Nif = src.nextLine();
		
		for(int i=0; i<cuentas.size()-1; i++) {
			if(Nif == cuentas.get(i).getNif()) {
				System.out.println(clientes.get(i).getNombre());
			}
		}

		
		
	}
	
	public static void main(String[] args) {
		
		
		Banco j = new Banco();
		
		j.altaCliente(null);
		j.altaCuenta(null);
		j.consultaCuenta();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
























