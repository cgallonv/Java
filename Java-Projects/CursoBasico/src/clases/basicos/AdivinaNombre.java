package clases.basicos;

import javax.swing.JOptionPane;

public class AdivinaNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "carlos";
		String password = "";
		
		while (clave.equals(password)==false) {
			if (!password.isBlank()) {
				password=JOptionPane.showInputDialog("Clave errada, intente nuevamente: ");
			} else {
				password=JOptionPane.showInputDialog("Adivine la clave");
			}
			
		}
		
	}

}
