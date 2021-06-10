package clases.udemy.newfeatures;

public class StringNewAPIRunner {

	public static void main(String[] args) {
		//String string11 = null;
		//System.out.println(string11.isBlank());     //Better nullpointer error messages
		System.out.println("".isBlank());
		System.out.println(" AS ".strip());
		System.out.println(" AS ".stripLeading());
		System.out.println(" AS ".stripTrailing());
		"Line1\nLine2\nLine3\n".lines().forEach(System.out::println);
		System.out.println("UPPER".transform(String::toLowerCase));
		System.out.println("My name is %s and my age is %s".formatted("Carlos", 31));
		
	}

}
