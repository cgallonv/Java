package clases.udemy.functionalprogramming;

import java.util.List;

public class FPSumNumberRunner {

	public static void main(String[] args) {
		List<Integer> lista = List.of(99, 12, 2, 43, 54, 2, 76, 99);
		Integer suma = lista.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Suma simple: " + suma);

		// máximo número
		System.out.print("Suma con Filtro:");
		suma = lista.stream().filter(element -> element % 2 == 0) // intermediate operation: puede reducir, cambiar un
																	// tipo, como resultado
																	// genera un stream nuevo
				.reduce(0, Integer::max);// terminal operation: donde se procesa o se consume el elemento
		System.out.println(suma);

		// En varias lineas y código complejo
		System.out.println("Suma con codigo complejo:");
		suma = lista.stream().reduce(0, (a, b) -> {
			System.out.println(a + "+" + b);
			return a + b;
		});
		System.out.println("Resultado: " + suma);

		// Diferent intermediate operations
		// Sorting
		System.out.println("Sorted:");
		lista.stream().sorted().forEach(e -> System.out.println(e));

		// unique elements + sorted
		System.out.println("Distinct:");
		lista.stream().distinct().sorted().forEach(e -> System.out.println(e));

		// encontrar el cuadrado de los numeros únicos
		System.out.println("Cuadrados de cada numero único ordenado:");
		lista.stream().distinct().sorted().map(e -> e*e).forEach(e -> System.out.println(e));

	}

}
