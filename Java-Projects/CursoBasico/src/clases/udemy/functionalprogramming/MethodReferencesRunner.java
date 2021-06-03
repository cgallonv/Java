package clases.udemy.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
			.map(String::length)
			.forEach(g  -> System.out.println(g));
		
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
			.map(String::length)
			.forEach(System.out::println); 
		
		Integer max = List.of(33,31,5,3,1,24).stream()
			.filter(MethodReferencesRunner::isEven)
			.max(Integer::compare)
			.orElse(0);
		System.out.println(max);
	}

	private static boolean isEven(Integer number) {
		return number%2==0;
	}

}
