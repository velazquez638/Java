
package Modelo_Vista_Controlador;
import java.time.LocalDate;

//Es un patron de arquitectura de software que separa los datos y prncipalmente lo que es la logica de noegocio de una aplicacio
//de se presentacion y el modulo ecargado de gestionar los eventos y las comunicaciones.
//para ello creamos tres componentes distintos, modelo, vista controlador.


public class Programa {
	
	 public static void main(String[] args) {
	 // el objeto csic representa el modelo (datos)
		 
	 CentroInvestigacion csic = new CentroInvestigacion("www.csic.es");
	 // los objetos consola y swing representan las vistas
	 
	 VistaConsola consola = new VistaConsola();
	 VistaSwing swing = new VistaSwing();
	 // los objetos controladorConsola y controladorSwing son los controladores que modifican el estado del modelo (csic)
	 // y actualizan las dos vistas (consola y Swing)
	 
	 Controlador controladorConsola = new Controlador(csic, consola);
	 Controlador controladorSwing = new Controlador(csic, swing);
	 // el controlador ControladorConsola da de alta seis investigadores
	 
	 
	 controladorConsola.altaInvestigador(new InvestigadorFormacion("1", "Jaime",  "González", LocalDate.parse("2017-01-02"), 22000.0, false));
	 controladorConsola.altaInvestigador(new InvestigadorFormacion("2", "Juan",   "Fernández", LocalDate.parse("2015-09-01"), 24000.0, true));
	 controladorConsola.altaInvestigador(new InvestigadorFormacion("3", "Marta",  "Robledo",  LocalDate.parse("2014-09-01"), 25000.0, true));
	 controladorConsola.altaInvestigador(new InvestigadorTitular  ("4", "Óscar",  "Sánchez",  LocalDate.parse("2016-01-15"), 34000.0, 0));
	 controladorConsola.altaInvestigador(new InvestigadorTitular  ("5", "Miguel", "Álvarez", LocalDate.parse("2012-10-01"), 36000.0, 1));
	 controladorConsola.altaInvestigador(new InvestigadorTitular  ("6", "Rodrigo","López",  LocalDate.parse("2011-03-15"), 38000.0, 2));
	 // la salida por la consola y por la ventana de Swing se hace
	 // con el método actualizaVista de los controladores
	 
	 controladorConsola.actualizaVista();
	 controladorSwing.actualizaVista();
	 // los controladores pueden modificar el modelo (csic)
	 
	 controladorConsola.setWeb("www.csic.com");
	 controladorConsola.actualizaVista();
	 // el controlador ControladorSwing da de alta un
	 // nuevo investigadpr
	 
	 controladorSwing.altaInvestigador(new InvestigadorTitular("7", "Rogelio", "Martín", LocalDate.parse("2012-06-30"), 38000.0, 2));
	 // las vistas muestran los datos actualizados del modelo (csic)
	 
	 controladorConsola.actualizaVista();
	 controladorSwing.actualizaVista();
	}
}