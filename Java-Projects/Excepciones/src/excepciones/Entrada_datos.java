package excepciones;

import java.util.*;
//entrada de datos
public class Entrada_datos {

	public static void main(String[] args) {

		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");

		Scanner entrada = new Scanner(System.in);
		int decision = entrada.nextInt();

		if (decision == 1) {
			try {
				/*
				 * Hay dos tipos de erores, los comprobados y los no comprobados. No comprobado=
				 * error del desarrollador, y no necesariamente hay que usar try-catch
				 * Comprobados= son de máquina, error de disco, memoria, etc, se requiere
				 * try-catch
				 */
				// no me obliga a usar el try-catch porque hereda de runtime exception
				// Si heredara de IOException si me obligaria a implementarlo.
				pedirDatos();
			} catch (InputMismatchException e) {
				System.out.println("Has ingresado parametros incorrectos: " + e.toString());
			} catch (NuevaExcepcion e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			} finally {
				System.out.println("Adios");
				System.exit(0);
			}
		} else {
			System.out.println("Adios");
			System.exit(0);
		}
		entrada.close();
	}

	static void pedirDatos() throws NuevaExcepcion {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario = entrada.nextLine();
		if (nombre_usuario.length() <= 3) {
			entrada.close();
			throw new NuevaExcepcion("El nombre es muy  corto");
		}
		System.out.println("Introduce edad, por favor");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombre_usuario + ". El anio que viene tendras " + (edad + 1) + " años");
		entrada.close();
		System.out.println("Hemos terminado");
	}
}
