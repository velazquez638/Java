package Numeros_Complejos;



public class Complejos {
	public static void main(String[] args) {
		
		NumeroComplejo a, b, c, d, e, f, g;
		
		a = new NumeroComplejo( 1, -2 );
		b = new NumeroComplejo( 4, 3 );
		c = new NumeroComplejo( 2, 1 );
		d = new NumeroComplejo( 1, 1 );
		e = new NumeroComplejo( 2, 3 );
		f = new NumeroComplejo( 3, 2 );
		g = new NumeroComplejo( -1, 2 );
		
		NumeroComplejo i = new NumeroComplejo( 0, 1 );
		System.out.println("Métodos de clase (estáticos) \n");
		System.out.println(NumeroComplejo.toString("a", a));
		System.out.println(NumeroComplejo.toString("b", b));
		System.out.println(NumeroComplejo.toString("c", c));
		System.out.println(NumeroComplejo.toString("d", d));
	    System.out.println(NumeroComplejo.toString("e", e));
		System.out.println(NumeroComplejo.toString("f", f));
		System.out.println(NumeroComplejo.toString("g", g));
		System.out.println(NumeroComplejo.toString("i", i) + "\n");
		
		System.out.println(NumeroComplejo.toString("suma(a,b) ",           NumeroComplejo.suma(a, b)));
		System.out.println(NumeroComplejo.toString("resta(a,b) ",          NumeroComplejo.resta(a, b)));
		System.out.println(NumeroComplejo.toString("producto(i,i) ",       NumeroComplejo.producto(i, i)));
		System.out.println(NumeroComplejo.toString("producto(c,b) ",       NumeroComplejo.producto(c, b)));
		System.out.println(NumeroComplejo.toString("reciproco(d) ",        NumeroComplejo.reciproco(d)));
		System.out.println(NumeroComplejo.toString("cociente(c,b) ",       NumeroComplejo.cociente(c, b)));
		System.out.println(NumeroComplejo.toString("cociente(f,g) ",       NumeroComplejo.cociente(f, g)));
		System.out.println(NumeroComplejo.toString("producto(e, conj(e)) ",NumeroComplejo.producto(e,NumeroComplejo.conjugado(e))));
		
		System.out.println("");
		System.out.println("Métodos de instancia \n");
		System.out.println(a.toString("a"));
		System.out.println(b.toString("b"));
		System.out.println(c.toString("c"));
		System.out.println(d.toString("d"));
		System.out.println(e.toString("e"));
		System.out.println(f.toString("f"));
		System.out.println(g.toString("g"));
		System.out.println(i.toString("i") + "\n");
		
		NumeroComplejo r;
		
		r = a.suma(b);
		System.out.println(r.toString("suma(a,b) "));
		r = a.resta(b);
		System.out.println(r.toString("resta(a,b) "));
		r = i.producto(i);
		System.out.println(r.toString("producto(i,i) "));
		r = c.producto(b);
		System.out.println(r.toString("producto(c,b) "));
		r = d.reciproco();
		System.out.println(r.toString("reciproco(d) "));
		r = c.cociente(b);
		System.out.println(r.toString("cociente(c,b) "));
		r = f.cociente(g);
		System.out.println(r.toString("cociente(f,g) "));
		r = e.producto(e.conjugado());
		System.out.println(r.toString("producto(e, conj(e)) "));
	}
}