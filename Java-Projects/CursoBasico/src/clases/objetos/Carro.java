package clases.objetos;

public class Carro {

	private int peso;
	private final int ruedas = 4;
	private int largo;
	private int ancho;
	private int motor_cc;
	private String color;
	private int peso_total;
	private boolean aire_acondicionado, asientos_cuero;

	// constructor publico y con el nombre de la clase.
	public Carro() {
		System.out.println("CARRO");
		setLargo(2000);
		setAncho(1000);
		setMotor_cc(1600);
		setPeso(1000);
		setAire_acondicionado(true);
		setAsientos_cuero(false);
		setPeso_total(1100);
		setColor("azul");

	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getRuedas() {
		return this.ruedas;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getMotor_cc() {
		return motor_cc;
	}

	public void setMotor_cc(int motor_cc) {
		this.motor_cc = motor_cc;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPeso_total() {
		return peso_total;
	}

	public void setPeso_total(int peso_total) {
		this.peso_total = peso_total;
	}

	public boolean isAire_acondicionado() {
		return aire_acondicionado;
	}

	public void setAire_acondicionado(boolean aire_acondicionado) {
		this.aire_acondicionado = aire_acondicionado;
	}

	public boolean isAsientos_cuero() {
		return this.asientos_cuero;
	}

	public void setAsientos_cuero(boolean asientos_cuero) {
		this.asientos_cuero = asientos_cuero;

	}
	
	public int getPrecio() {
		int precio_final= 20000;
		if (this.isAire_acondicionado()) {
			precio_final=precio_final+500;
		}
		if (this.isAire_acondicionado()) {
			precio_final=precio_final+800;
		}
		return precio_final;
	}
	
}