package clases.udemy.functionalprogramming;

import java.util.List;

public class FuncionalPStringPRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		printWithFPFiltering(list);
		printWithFP(list);
	}

	/**
	 * Imprimir usando programación funcional
	 */
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	/**
	 * Imprimir usando programación funcional
	 */
	private static void printWithFPFiltering(List<String> list) {
		list.stream()
			.filter(
					element -> element.endsWith("at"))
			.forEach(
					element -> System.out.println(element)
			);
	}
}
