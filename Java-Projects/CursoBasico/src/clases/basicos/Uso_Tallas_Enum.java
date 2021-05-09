package clases.basicos;

import java.util.Scanner;

public class Uso_Tallas_Enum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIO o LARGO");
		String tallaIngresada = scan.nextLine().toUpperCase();

		try {
			// Ambos llamados son iguales, uno usa la clase genérica enum y la otra el enum
			// específico.
			Clase_Enum talla = Enum.valueOf(Clase_Enum.class, tallaIngresada);
			// Clase_Enum talla = Clase_Enum.valueOf(tallaIngresada);

			System.out.println("La talla ingresada fue " + talla.getAbreviatura());
			System.out.println("Y la abreviatura es  " + talla);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Valor no permitido.");
		}

		scan.close();
	}

}
