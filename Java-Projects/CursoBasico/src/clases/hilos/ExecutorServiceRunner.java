package clases.hilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		//ExecutorService exService = Executors.newSingleThreadExecutor();
		ExecutorService exService = Executors.newFixedThreadPool(2);
		exService.execute(new Task1());
		exService.execute(new Thread(new Task2()));
		
		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
		System.out.println("Main Done");
		
		exService.shutdown();
	}

}
