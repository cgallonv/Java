package clases.udemy.newfeatures;

import java.util.List;

public class TypeInferencesRunner {
	
	public static void main(String[] args) {
		List<String> name = List.of("Carlos", "Andres");
		List<String> name2 = List.of("Angela", "Maria");
		List<List<String>> names = List.of(name, name2);
		
		//var hola = null;
		//with var type is infered.
		final var nameListInfered = names;
		nameListInfered.stream().forEach(System.out::println);
		
	}

}
