package clases.streams;

import java.io.*;

public class EjemploLecturaBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream lectura = new FileInputStream(
					"C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/ImagenLectura.png");
			FileOutputStream escritura = new FileOutputStream(
					"C:/Carlos/Programacion/Estudio/Java/Java-Projects/CursoBasico/src/resources/ImagenCopia.png");
			int bytelectura = lectura.read();
			while (bytelectura != -1) {
				System.out.println(bytelectura);
				escritura.write(bytelectura);
				bytelectura = lectura.read();
			}
			escritura.close();
			lectura.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
