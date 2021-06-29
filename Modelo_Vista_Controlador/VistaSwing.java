package Modelo_Vista_Controlador;

import javax.swing.JOptionPane;

public class VistaSwing implements IVista {
	
	 public void salida(String s) {
		 
		 JOptionPane.showMessageDialog(null, s, "Java Swing",
		 JOptionPane.INFORMATION_MESSAGE, null);
	 
	 }
}
