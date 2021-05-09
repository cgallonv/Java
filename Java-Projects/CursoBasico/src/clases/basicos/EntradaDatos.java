package clases.basicos;

import java.util.Scanner;

public class EntradaDatos {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre = scan.nextLine();
		
		System.out.println("Introduce tu edad:");
		int edad = scan.nextInt();
		
		System.out.println("te llamas " + nombre.toUpperCase() + " y tu edad es: " + edad );
		scan.close();
	}
}
