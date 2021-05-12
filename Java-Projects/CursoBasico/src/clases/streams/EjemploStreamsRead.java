package clases.streams;

import java.io.*;

public class EjemploStreamsRead {

	public static void main(String[] args) {
		// Para flujos de bytes - Clases Abstractas InputStream y OutputStream de JavaIO
		// Para secuencias de caracteres - Clases abstractas Reader Y Writer también de
		// JavaIO

		Leer_Archivos.reader();
	}

}

class Leer_Archivos {

	@SuppressWarnings("resource")
	public static void reader() {
		FileReader archivo = null;
		char[] texto = new char[50];
		try {
			archivo = new FileReader("C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/archivolocal.txt");
			
			//Forma 1: con una cadena de char.
			archivo.read(texto);
			for (char c : texto) {
				System.out.print(c);
			}
			System.out.println();
			//Forma 2: con el codigo int de cada caracter.
			archivo = new FileReader("C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/archivolocal.txt");
			int codigoentero = archivo.read();
			char letra;
			while (codigoentero != -1) {
				letra= (char)codigoentero; 
				System.out.print(letra);
				codigoentero = archivo.read();
				
			}
			archivo.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Archio no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}