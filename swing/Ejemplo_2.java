package swing;
import javax.swing.JOptionPane;


public class Ejemplo_2 {

	public static void main(String[] args) {
		
		 JOptionPane.showMessageDialog(null, "Hola, este es mi primer programa Java con Swing");
		 
		 JOptionPane.showMessageDialog(null, "Este es un mensaje de error crítico", "Swing",JOptionPane.ERROR_MESSAGE, null); 
		 JOptionPane.showMessageDialog(null, "Este es un mensaje informativo", "Swing", JOptionPane.INFORMATION_MESSAGE, null);
		 JOptionPane.showMessageDialog(null, "Este es un mensaje de advertencia", "Swing", JOptionPane.WARNING_MESSAGE, null);
		 JOptionPane.showMessageDialog(null, "Este es un mensaje de interrogación", "Swing", JOptionPane.QUESTION_MESSAGE, null);
		 }

}
