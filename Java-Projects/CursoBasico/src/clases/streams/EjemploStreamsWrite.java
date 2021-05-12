package clases.streams;

import java.io.*;

public class EjemploStreamsWrite {

	public static void main(String[] args) {
		Escribir_Archivo.escribir();
	}

}

class Escribir_Archivo {

	public static void escribir() {
		String frase = "Esta es una prueba de escritura2";
		try {
			FileWriter archivoDestino = new FileWriter(
					"C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/archivoescrito.txt", true);
			archivoDestino.write(frase.toCharArray());
			archivoDestino.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
