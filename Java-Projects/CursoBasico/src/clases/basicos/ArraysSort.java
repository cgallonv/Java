package clases.basicos;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chararray = { 'a', 'z', 'g', 'g' };
		for (char i : chararray) {
			System.out.print(i + "-");
		}
		Arrays.sort(chararray);
		System.out.println();
		for (char i : chararray) {
			System.out.print(i + "-");
		}
	}

}
