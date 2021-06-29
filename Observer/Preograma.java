package Observer;

//define una dependencia de uno a muchos entre objetos, de manera que cuando uno de los objetos cambia su estado, notifica
//este cambio a todos los dependientes. Se trata de un patron de comportamiento, por lo que est� relacionado con algoritmos de 
//de funcionamiento y asignaci�n de responsabilidad.


public class Preograma {

	public static void main(String[] args) {
		
		 EstacionMeteorologica m1 = new EstacionMeteorologica("Madrid Centro");
		 EstacionMeteorologica m2 = new EstacionMeteorologica("Madrid Norte ");
		 EstacionMeteorologica m3 = new EstacionMeteorologica("Madrid Sur ");
		 EstacionMeteorologica m4 = new EstacionMeteorologica("Madrid Este ");
		 EstacionMeteorologica m5 = new EstacionMeteorologica("Madrid Oeste ");
		 
		 Pantalla p1 = new Pantalla("Pantalla 1");
		 Pantalla p2 = new Pantalla("Pantalla 2");
		 Pantalla p3 = new Pantalla("Pantalla 3");
		 
		 m1.a�adirObservador(p1);
		 m1.a�adirObservador(p2);
		 m2.a�adirObservador(p2);
		 m2.a�adirObservador(p3);
		 m3.a�adirObservador(p3);
		 m4.a�adirObservador(p1);
		 m5.a�adirObservador(p1);
		 
		 m1.mensaje("D�a de frio y lluvia en el centro");
		 m2.mensaje("Las lluvias remiten en el norte");
		 m3.mensaje("Despejado en el sur");
		 m4.mensaje("Dia ventoso en el este");
		 m5.mensaje("Dia desapacible en el oeste");
		 
		 m1.eliminarObservador(p2);
		 m1.mensaje("Sube la temperatura en el centro");
		 
	}
}
