package clases.hilos;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSync {

	public static void main(String[] args) {
		Banco banco = new Banco();

		for (int i = 0; i < 100; i++) {
			EjecutarTransderencias bancoAsincronico = new EjecutarTransderencias(banco, i, 2000);
			Thread t = new Thread(bancoAsincronico);
			t.start();
		}

	}

}

class Banco {
	// debe crear 100 cuentas con 2000 euros cada una

	private final double[] cuentas = new double[100];
	private Lock bloqueoTransacciones = new ReentrantLock();
	private Condition saldoSuficiente;

	public Banco() {
		for (int i = 0; i < cuentas.length; i++) {
			cuentas[i] = 2000;
		}
		saldoSuficiente = bloqueoTransacciones.newCondition();
	}

	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
		bloqueoTransacciones.lock();
		try {
			while (cantidad > this.cuentas[cuentaOrigen]) {
				saldoSuficiente.await();
			}

			this.cuentas[cuentaOrigen] -= cantidad;
			System.out.print(Thread.currentThread() + " - ");
			System.out.printf("%10.2f de cuenta %d (disponible %10.2f) para cuenta %d", cantidad, cuentaOrigen,
					this.cuentas[cuentaOrigen], cuentaDestino);
			this.cuentas[cuentaDestino] += cantidad;
			System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());
			saldoSuficiente.signalAll();
		} finally {
			bloqueoTransacciones.unlock();
		}
	}

	public double getSaldoTotal() {
		double sumaCuentas = 0;
		for (double d : cuentas) {
			sumaCuentas += d;
		}
		return sumaCuentas;

	}

}

class EjecutarTransderencias implements Runnable {
	private Banco banco;
	private int cuentaOrigen;
	private double maximaCantidad;

	public EjecutarTransderencias(Banco banco, int origenFondos, double max) {
		// la cuenta destino será random
		this.banco = banco;
		this.cuentaOrigen = origenFondos;
		this.maximaCantidad = max;

	}

	public void run() {
		while (true) {
			int cuentaDestinoRandom = (int) (100 * Math.random());

			double cantidadATransferir = maximaCantidad * Math.random();
			// System.out.print(cuentaOrigen + "-" + cuentaDestinoRandom + "-" +
			// cantidadATransferir);

			try {
				banco.transferencia(cuentaOrigen, cuentaDestinoRandom, cantidadATransferir);
				Thread.sleep((int) (1000 * Math.random()));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}