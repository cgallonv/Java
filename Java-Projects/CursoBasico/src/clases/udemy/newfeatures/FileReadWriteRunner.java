package clases.udemy.newfeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
	
	public static void main(String[] args) {
		Path path = Paths.get("./src/resources/archivolocal.txt");
		Path pathToWrite = Paths.get("./src/resources/archivoescrito.txt");
		try {
			String readString = Files.readString(path);
			System.out.println(readString);
			String stringToWrite = "Prueba escritura java 11 con Files.writeString";
			Files.writeString(pathToWrite, stringToWrite);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
