package clases.udemy.newfeatures;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	
	public static boolean isEven(Integer number) {
		return number%2==0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,5,2,7,8,3);
		Predicate<Integer> evenNumbersPredicate = number -> number%2==0;
		//Predicate<Integer> evenNumbersPredicate = Predicate.not(number -> number%2==0);
		
		numbers.stream().filter(evenNumbersPredicate.negate())
			.forEach(System.out::println);
		
		System.out.println("-----");
		
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven))
			.forEach(System.out::println);
	}

}
