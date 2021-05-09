package clases.basicos;

import javax.swing.JOptionPane;

public class EntradaNumeros {

	public static void main(String[] args) {

		double a = 10000.0;
		System.out.printf("%1.2f",a/3);
		System.out.println();
		
		
		String numero = JOptionPane.showInputDialog("Introduce un número");
		double numeroD = Double.parseDouble(numero);
		System.out.printf("%1.2f",Math.sqrt(numeroD));
	}

}
