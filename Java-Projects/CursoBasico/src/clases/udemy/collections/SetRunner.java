package clases.udemy.collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> list = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		Set<Character> characters = new LinkedHashSet<Character>(list);
		System.out.println("LinkedHashSet: " + characters.toString());
		characters = new TreeSet<Character>(list);
		System.out.println("Treeset: " + characters.toString());
		
		TreeSet<Integer> treeSet2 = new TreeSet<>(Set.of(45,76,23,54,65,34));
		System.out.println("Treeset2: " + treeSet2.toString());
		System.out.println("Treeset2 lower than 54: " + treeSet2.lower(54));
	}

}
