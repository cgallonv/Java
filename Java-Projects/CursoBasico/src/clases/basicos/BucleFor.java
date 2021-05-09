package clases.basicos;

import javax.swing.*;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (inicialización; hasta cuando; incremento)
		// ctrl + shift + f formateo.

		int arroba = 0;
		int punto = 0;
		String mail = JOptionPane.showInputDialog("Introduce Mail");

		for (int i = 0; i < mail.length(); i++) {
			//System.out.println(mail.charAt(i));
			if (mail.charAt(i) == '@') {
				arroba++;
			} else if (mail.charAt(i) == '.') {
				punto++;
			}
		}
		if (arroba==1 && punto==1) {
			System.out.println("Es un correo válido");
		} else {
			System.out.println("No es un correo válido");
		}

	}

}
