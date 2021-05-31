package clases.hilos;

public class SincronizacionHilos {

	public static void main(String[] args) {
		
		HilosVarios hilo1 = new HilosVarios();
		HilosVarios2 hilo2 = new HilosVarios2(hilo1);

		hilo2.start();
		hilo1.start();
		
		System.out.println("Terminadas las ejecuciones.");
	}

}

class HilosVarios extends Thread {

	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("ejecutando hilo " + getName() + " - " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class HilosVarios2 extends Thread {
	private Thread hilo;
	public HilosVarios2(Thread hilo) {
		this.hilo=hilo;
	}
		
	
	
	public void run() {
		try {
			//Sincroniza el hilo.
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 15; i++) {
			System.out.println("ejecutando hilo " + getName() + " - " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}