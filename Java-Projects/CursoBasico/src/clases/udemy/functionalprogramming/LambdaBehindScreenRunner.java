package clases.udemy.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaBehindScreenRunner {

	public static void main(String[] args) {
		
		List.of(1,2,4,64,5).stream()
			.filter(n -> n%2==0)    				// Stream<T> filter(Predicate<? super T> predicate);
													// boolean test(T t);
													// Un filter toma un objeto y retorna true o false según una regla
			.map(n -> n*n) 							// <R> Stream<R> map(Function<? super T, ? extends R> mapper);
													// R apply(T t);
													// Un mapper toma un parametro de entrada y salida y aplica una transformación
			.forEach(e -> System.out.println(e));   // void forEach(Consumer<? super T> action);
													// void accept(T t);
													// ForEach toma un elemento a la vez y aplica una operación y no retorna nada
		List.of(1,2,4,64,5).stream()
			.filter(new EvenNumberPredicate())
			.map(new SquareMapFunction())
			.forEach(new PrinterConsumer());
		
	}

}

class SquareMapFunction implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t*t;
	}
	
}

class PrinterConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println("Inhouse printer: " + t);
	}
	
}

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number%2==0;
	}
	
}
