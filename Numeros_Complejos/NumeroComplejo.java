package Numeros_Complejos;

public class NumeroComplejo {
	

	private float real;
	private float imaginario;
	 
	 public NumeroComplejo(float real, float imaginario) {
		super();
		this.real = real;
		this.imaginario = imaginario;
	}

	 public NumeroComplejo() {
		super();
		this.real = 0.0f;
		this.imaginario = 0.0f;
	}
	 
	 public NumeroComplejo resta(NumeroComplejo c) {
		 
		return new NumeroComplejo(this.real - c.real, this.imaginario - c.imaginario);
	
	 }
	 
	 
	 public NumeroComplejo suma(NumeroComplejo c) {
		 
		return new NumeroComplejo(this.real + c.real, this.imaginario + c.imaginario);
	
	 }
	 
	 
	 public NumeroComplejo producto(NumeroComplejo c) {
		 
		return new NumeroComplejo(this.real * c.real - this.imaginario * c.imaginario, this.real * c.imaginario);
	 }
	 
	 
	 public NumeroComplejo cociente(NumeroComplejo c) {
		 
			return producto(reciproco(c), this); 
			
	}
	 
	 
	 public NumeroComplejo conjugado() {
		 
		return new NumeroComplejo(this.real, -this.imaginario);
	 }
	 
	 
	 public NumeroComplejo reciproco() {
		
		 float denominador = this.real * this.real + this.imaginario * this.imaginario;
		 
		 return new NumeroComplejo (this.real / denominador, -this.imaginario / denominador);
	 }
	 
	 
	 
	 public static NumeroComplejo suma(NumeroComplejo a,NumeroComplejo b) {
		 
		return new NumeroComplejo(a.real + b.real, a.imaginario + b.imaginario);
	 
	 }
	 
	 
	 public static NumeroComplejo resta(NumeroComplejo a,NumeroComplejo b) {
		 
		return new NumeroComplejo(a.real - b.real, a.imaginario - b.imaginario);
	}
	 
	 
	public static NumeroComplejo producto(NumeroComplejo a,NumeroComplejo b) {
		return new NumeroComplejo(a.real * b.real - a.imaginario * b.imaginario, a.real * b.imaginario + a.imaginario * b.real);
	 }
	
	
	public static NumeroComplejo conjugado(NumeroComplejo a) {
		
		return new NumeroComplejo(a.real, -a.imaginario);

	}
	
	
	public static NumeroComplejo reciproco(NumeroComplejo a) {
		
		float denominador = a.real * a.real + a.imaginario * a.imaginario;
		
		return new NumeroComplejo(a.real/denominador, -a.imaginario/denominador);
			
	}
	
	
	public static NumeroComplejo cociente(NumeroComplejo a,NumeroComplejo b) {
		
		return producto(reciproco(b), a);
	}
	
	
	public static String toString(String s, NumeroComplejo c) {
			 return c.toString(s);
	}
	
	
	public String toString(String s) {
		
		String num = s + " = (" + this.real;
		
		if (this.imaginario >= 0)
			
			num = num + " + ";
		
		else
			
			num = num + " - ";
		
		if (Math.abs(this.imaginario) != 1.0f)
			
			num = num + Math.abs(this.imaginario);
			num = num + "i)";
			
		return num;
	}
}