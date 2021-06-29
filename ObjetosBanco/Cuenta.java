package ObjetosBanco;

public class Cuenta {
	
	private String Numero;
	private String Nif;
	private float Saldo;
	
	public Cuenta(String numero, String nif) {
		super();
		Numero = numero;
		Nif = nif;
	}

	public Cuenta(String numero, String nif, float saldo) {
		super();
		Numero = numero;
		Nif = nif;
		Saldo = saldo;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public String getNif() {
		return Nif;
	}

	public void setNif(String nif) {
		Nif = nif;
	}

	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float saldo) {
		Saldo = saldo;
	}
	
	
	
	

}
