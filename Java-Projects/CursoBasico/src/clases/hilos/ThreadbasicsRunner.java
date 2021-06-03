package clases.hilos;

public class ThreadbasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		
		//dos estrategias, extender Thread o implementar Runnable
		/*
		 * Stados de Hilos:
		 * New
		 * Runnable
		 * Running
		 * Blocked/Waiting
		 * Terminated/Dead
		 * */
		
		
		// Task1 - extends Thread
		Thread task1 = new Task1();
		System.out.println("task1 status:" +  task1.getState());
		task1.start(); //Si se usa .run() no se ejecuta en paralelo, corre secuencial.
		task1.setPriority(Thread.MIN_PRIORITY);
		
		// Task2
		Thread task2 = new Thread(new Task2());
		task2.setPriority(Thread.MAX_PRIORITY);
		task2.start();
		
		task1.join();
		
		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
		System.out.println("Main Done");
	}
}

class Task1 extends Thread {
	public void run() {
		System.out.println("\nTask1 Started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Done");		
	}
	
}
