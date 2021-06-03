package clases.udemy.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriterRunner {

	public static void main(String[] args) throws IOException {
		Path directory = Paths.get("./src/resources/PFarchivoescritura.txt");
		
		List<String> list = List.of("Dog", "Cat", "Apple", "Elepahant");
		Files.write(directory, list);
	}

}
