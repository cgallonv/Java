package clases.udemy.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {
	
	
	
	public static void main(String[] args) {
		Queue<String> cola = new PriorityQueue<>(new StringComparator());
		cola.poll();
		System.out.println(cola);
		cola.offer("Apple");
		System.out.println(cola);
		cola.addAll(List.of("Pera", "Gatos", "Amarillo"));
		System.out.println(cola);
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		System.out.println(cola.poll());
	}
}

class StringComparator implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		if (o1.charAt(0) < o2.charAt(0)) {
			return -1;
		} else if (o1.charAt(0) > o2.charAt(0)) {
			return 1;
		}
		return 0;
	}
	
}