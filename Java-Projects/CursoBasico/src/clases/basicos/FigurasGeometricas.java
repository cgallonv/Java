package clases.basicos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class FigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Elija alguna de las siguientes figuras: \n1 Cuadrado \n2 circulo \n3 rectangulo \n4 triangulo");
		int base=0;
		int altura = 0;
		int diametro=0;
		//elegir la figura
		int figuraGeometrica = scan.nextInt();

		
		switch (figuraGeometrica) {
			case 1 :
				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
				base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base"));
				System.out.println("el area del cuadrado es= " + (base*altura) );
				break;
			 case 2: 
				diametro = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el diametro"));
				System.out.println("el area del circulo es: ");
				System.out.printf("%1.2f", diametro*Math.PI);
				break;
			 case 3: 
				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
				base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base"));
				System.out.println("el area del rectangulo es= " + (base*altura) );
				break;
			 case 4 : 
				altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
				base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base"));
				System.out.println("el area del triangulo es= " + (base*altura/2) );
				break;
			
			
		}
		
		
		scan.close();

	}

}
