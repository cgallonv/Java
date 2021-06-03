package clases.udemy.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryRunner {
	public static void main(String[] args) throws IOException {
		// listar archivos de una ruta con FP
		Path currentDirectory = Paths.get(".");
		Files.list(currentDirectory).forEach(System.out::println);
		
		System.out.println("--------------------");
		
		//*****important, predicate for filter as local variable
		Predicate<? super Path> predicate = s -> String.valueOf(s).endsWith(".java");
		Files.walk(currentDirectory, 4)
			.filter(predicate )
			.forEach(System.out::println); //4 lvls deep files
		
		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).endsWith(".java");
		Files.find(currentDirectory, 4, matcher ).forEach(System.out::println);
	}

}
