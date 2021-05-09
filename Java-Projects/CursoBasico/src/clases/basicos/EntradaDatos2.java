package clases.basicos;

import javax.swing.JOptionPane;

public class EntradaDatos2 {

	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Cual es tu nombre?");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Cual es tu edad?"));
		System.out.println("Tu edad es " + (edad+1) + " y te llamas " + nombre);
	}

}
