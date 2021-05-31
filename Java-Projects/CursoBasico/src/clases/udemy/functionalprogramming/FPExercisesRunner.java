package clases.udemy.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPExercisesRunner {

	public static void main(String[] args) {
		//List<Integer> numbers = List.of(4,6,8,13,3,15);
		List<String> stringList = List.of("Apple", "Ant", "Bat"); 
		
		System.out.println("Print squares of first 10 numbers:");
		IntStream.range(1, 11).map(x -> x*x).forEach(x -> System.out.println(x));;

		System.out.println("Map strings to lowercase:");
		stringList.stream().map(String::toLowerCase).forEach(s -> System.out.println(s));
		
		System.out.println("Length for each element:");
		stringList.stream().forEach(s -> System.out.println(s + " length:" + s.length()));
		
		// sin el .get() me trae un valor "opcional" por que puede ser null.
		System.out.print("Max number of a list:");
		System.out.println(List.of(4,5,83,1,3).stream().max((a,b) -> Integer.compare(a, b)).get());
		
		//odd numbers
		System.out.println("Odd numbers:");
		List.of(4,5,83,1,3,12).stream().filter(x -> x%2 == 1).forEach(x -> System.out.println(x));
		
		//Make a new list
		List<Integer> list2 = List.of(4,5,83,1,3,12).stream().filter(x -> x%2 == 1).collect(Collectors.toList());
		System.out.println("List 2: " + list2);
		
		// List of squeares of frist 10 numbers:
		list2 = IntStream.range(1, 11).map(w -> w*w).boxed().collect(Collectors.toList());
		// map no retorna un stream, retorna in IntPipeline.
		System.out.println(IntStream.range(1, 11).map(w -> w*w));
		System.out.println("Lista 3 - cuadrados + boxed function: " + list2);
		
		
	}

}
