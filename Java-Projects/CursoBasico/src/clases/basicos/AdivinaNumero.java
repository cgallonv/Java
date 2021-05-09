package clases.basicos;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int clave = 0;
		int aleatorio = (int) (Math.random()*100);
		System.out.println(aleatorio);
		int intentos = 3;
		while (clave != aleatorio && !(intentos==0)) {
			intentos--;
			if (clave != 0) {
				System.out.println("clave incorrecta");
			} else {
				intentos++;
			}
			clave = scan.nextInt();
		}
		if (intentos == 0) {
			System.out.println("te quedaste sin intentos");
		} else 
			System.out.println("clave Correcta");
		scan.close();
	}

}
