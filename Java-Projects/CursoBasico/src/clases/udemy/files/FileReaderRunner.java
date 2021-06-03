package clases.udemy.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderRunner {

	public static void main(String[] args) throws IOException {
		Path directory = Paths.get("./src/resources/archivolocal.txt");
		System.out.println("Loads all at once:");
		Files.readAllLines(directory).stream().forEach(System.out::println);
		
		System.out.println("One at the time, for better perfomance on big files:");
		Files.lines(directory)
			.map(String::toLowerCase)
			.forEach(System.out::println);

	}

}
