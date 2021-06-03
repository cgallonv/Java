package clases.udemy.hilos;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentRunner {

	public static void main(String[] args) {
		concurretHashMapExample();
		copyOnWriteArrayListExample();
		
	}

	private static void copyOnWriteArrayListExample() {
		List<String> list = new CopyOnWriteArrayList<>();
		//Threads - 3
		list.add("Bat");
		list.add("Cat");
		list.add("Ant");
		
		//Threads - 10000 accesing that list
		//Better perfomance for reading. Only locked to add elements.
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void concurretHashMapExample() {
		// ConcurrentHashMap<K, V> concurrentMap = new ConcurrentHashMap<>();
		String str = "ABCD ABCD ABCD";
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
		
		for (char character : str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
//			LongAdder longAdder = occurances.get(character);
//			if (longAdder == null) {
//				longAdder =  new LongAdder();
//			}
//			longAdder.increment();
//			occurances.put(character, longAdder);
		}
		System.out.println(occurances);
	}

}
