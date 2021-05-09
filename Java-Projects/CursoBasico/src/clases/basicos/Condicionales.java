package clases.basicos;

import java.util.*;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = scan.nextInt();
		
		if (edad < 18) {
			System.out.println("menor de edad");
		} else if (edad>=18 && edad < 40) {
			System.out.println("Adulto");
		} else {
			System.out.println("paila");
		}
				
		scan.close();
	}

}
