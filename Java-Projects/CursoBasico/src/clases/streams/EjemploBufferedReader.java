package clases.streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBufferedReader {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader(
					"C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/archivolocal.txt");
			BufferedReader bufferLectura = new BufferedReader(file);
			String caracter = bufferLectura.readLine();
			while (caracter != null) {
				System.out.print(caracter);
				caracter = bufferLectura.readLine();
			}
			bufferLectura.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
