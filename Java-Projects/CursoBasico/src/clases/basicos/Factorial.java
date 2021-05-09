package clases.basicos;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el numero para calcular el factorial:");
		Scanner scan = new Scanner(System.in); 
		Long numero = scan.nextLong();
		Long resultadoFactorial = 1L;
		
		for (Long i = numero; i> 0; i--) {
			
			resultadoFactorial = resultadoFactorial*i;
		}
		System.out.println(resultadoFactorial);
		scan.close();
	}

}
