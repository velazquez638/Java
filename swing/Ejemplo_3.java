package swing;
import javax.swing.JOptionPane;


public class Ejemplo_3 {

	public static void main(String[] args) {

		 Object[] opciones = {"Opción A", "Opción B", "Opción C"};
		 
		 int opcion = JOptionPane.showOptionDialog(null,"Selecciona una de las siguientes opciones:","Swing", 
				 JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		 
		 JOptionPane.showMessageDialog(null, "Has elegido " + opciones[opcion]);

	}

}
