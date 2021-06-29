package Polinomio;

public class Polinomio {
	
	 private int grado;
	 private double [] coeficientes;
	 
	 public Polinomio(double [] coeficientes) {
		 
		 this.grado = coeficientes.length - 1;
		 this.coeficientes = new double[coeficientes.length];
		 for (int i=0; i<coeficientes.length; i++)
		 this.coeficientes[i] = coeficientes[i];
		 
	 }
	 
	 public double evalua(double x) {
		 
		double valor = 0;
			
		for (int i =0; i<this.grado; i++) {
				
			valor = valor +	coeficientes[i] * Math.pow(x, i);
		}

		return valor;
	 }
	 
	 
	 public static double evalua(Polinomio p, double x) {
		 
		 
		 double r = 0.0;
			
		 for (int i=p.grado; i>=0; i--)
			 r = r + p.coeficientes[i] * Math.pow(x, i);
		
		return r;
	 }
	 

	 
	 
	 public Polinomio derivada() {
		 
		 int coeficientesPolinomio = this.coeficientes.length;
		 
	        if (coeficientesPolinomio > 1) {
	    
	            int coeficientesDerivada = coeficientesPolinomio - 1;
	            Polinomio derivada = new Polinomio(new double[coeficientesDerivada]);
	            
	            	for (int i = 1; i < coeficientesPolinomio; i++) {
	            		derivada.coeficientes[coeficientesDerivada - i] = this.coeficientes[coeficientesPolinomio - i - 1] * i;
	            }
	            
	            return derivada;
	            
	        } else {
	        	
	            return new Polinomio(new double[1]);
	        }
	 }
	 
	 
	 
	 public static Polinomio derivada(Polinomio p) {
		 
		 
		 double [] coeficientes = new double[p.grado];
			
		 for (int i=p.grado; i>0; i--)
			 coeficientes[i-1] = i * p.coeficientes[i];
		
		 return new Polinomio(coeficientes);
	 }
	 
	 
	 
	 public Polinomio suma(Polinomio p) {
		 
		 int coeficientesSumando = this.coeficientes.length;
	     int coeficientesSumador = p.coeficientes.length;
	     int coeficientesSuma = Math.max(coeficientesSumando, coeficientesSumador);
	     Polinomio suma = new Polinomio(new double[coeficientesSuma]);

	     for (int i = 1; i <= coeficientesSuma; i++) {
	    	 if (coeficientesSumando - i < 0) {
	    		 
	    		 suma.coeficientes[coeficientesSuma - i] += p.coeficientes[coeficientesSumador - i];
	    		 
	         } else if (coeficientesSumador - i < 0) {
	        	 
	        	 suma.coeficientes[coeficientesSuma - i] += this.coeficientes[coeficientesSumando - i];
	        	 
	            } else {
	            	
	            	suma.coeficientes[coeficientesSuma - i] = this.coeficientes[coeficientesSumando - i] + p.coeficientes[coeficientesSumador - i];
	            
	            }
	        }
	     
	        return suma;
			
	 }
	 

	 
	 public static Polinomio suma(Polinomio p, Polinomio q) {
		 
		 double suma = 0;
		 
		 for (int i = 0; i<p.coeficientes.length; i++) {
			 for (int k = 0; k<q.coeficientes.length; k++) {
				 
				 suma = p.coeficientes[i] + q.coeficientes[k];
			 }
		 }
		  
         return p;
		 
	
	 }
	 
	 
	 
	 public boolean esIgual(Polinomio p) {
		 
		return Polinomio.esIgual(this, p);
			
	 }
	 
	 
	 
	 
	 public static boolean esIgual(Polinomio p, Polinomio q) {
		
		 Boolean esIgual;
			
		 if (p.coeficientes.length != q.coeficientes.length)
				
			 esIgual = false;
			
		 else {
			 esIgual = true;
				
			 for (int i=0; i< p.coeficientes.length; i++) {
				 
				 if (p.coeficientes[i] != q.coeficientes[i]) {
					 
					 esIgual = false;
					 System.out.println("son iguales");

					 break;
					}
				}
			}
			
			
			return esIgual;
	 }
	 
	 
	 
	 public String toString(String s) {
	
		 return Polinomio.toString(this, s);
	 }
		
	 
	 
	 
	 public static String toString(Polinomio p, String s) {
		 
		 s = s + " = ";
			
			for (int i=p.grado; i>=0; i--) {
				if (p.coeficientes[i] != 0.0) {
					if (p.coeficientes[i] < 0)
						s = s + " - " + Math.abs(p.coeficientes[i]);
					else
						if (i == p.grado)
							s = s + p.coeficientes[i];
						else 
							s = s + " + " + p.coeficientes[i];
		
					if (i >= 1) {
						s = s + "x";
		
						if (i >= 2)
							s = s + "^" + i;
					}
				}
			}
			return s;
		
	 }
	 
	 
	 
	 public void visualiza () {
		 
		 System.out.print("P(x) = ");
	        for (int i = 0; i < coeficientes.length - 1; i++) {
	            int indice = coeficientes.length - i - 1;
	            if (coeficientes[i] != 0) {
	                System.out.print(coeficientes[i] + " x^" + indice + " + ");
	            }
	        }
	            
	 }
	 
	 
	 
		public static void main(String[] args) {
			double a[] = {-3, 2, 3}; 
			double b[] = {2, -4, 2};

			Polinomio p1 = new Polinomio(a);
			Polinomio p2 = new Polinomio(b);

			String f = "f(x)";
			String g = "g(x)";

			String resultf = p1.toString(p1, f );
			String resultg = p2.toString(p2, g);

			System.out.println(resultf);


			p1.evalua(p1, -1);
			p2.evalua(p2, -1);

			System.out.println("f(-1) = " + p1.evalua(p1, -1));
			System.out.println("f'(x) = " + p1.derivada().toString(p1.derivada(), f));
			System.out.println("f'(x) = " + p1.derivada().evalua(p1.derivada(), -1));

			System.out.println("\n" + resultg);
			System.out.println("g(-1) = " + p2.evalua(p2, -1));
			System.out.println("g'(x) = " + p2.derivada().toString(p2.derivada(), g));
			System.out.println("f'(x) = " + p2.derivada().evalua(p2.derivada(), -1));

			System.out.println(p1.suma(p1, p2).toString(p1.suma(p1, p2), f));

			System.out.println(p1.esIgual(p1, p2));
		
			System.out.println("el primer polinomio es: \n");
			p1.visualiza();
			System.out.println("\n");

			System.out.println("el segundo polinomio es: \n");
			p2.visualiza();

		}
		
}
































