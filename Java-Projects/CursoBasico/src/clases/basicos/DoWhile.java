package clases.basicos;

import javax.swing.*;

public class DoWhile {

	public static void main(String args[]) {

		String genero= ""; 
		
		do {
			genero= JOptionPane.showInputDialog("Introduce tu genero (H/M): ");	
		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false ); 
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura: "));
		
		if (genero.equalsIgnoreCase("H")) {
			System.out.println("Su peso ideal para un hombre es: " + (altura - 110));
		} else {
			System.out.println("Su peso ideal para una mujere es: " + (altura - 120));
		}
			
		
	}
}
