package clases.udemy.newfeatures;

public class TextBlocksRunner {

	public static void main(String[] args) {
		String textBlock = """
				Line %s
				Line %b
				Line 
				"""
				.formatted(1,false);
		System.out.println(textBlock);
	}

}
