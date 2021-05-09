package clases.objetos;

public class Furgoneta extends Carro {
	
	private static int capacidad_carga;
	private static int plazas_extras;
	
	public Furgoneta(int capacidad_carga, int plazas_extras) {
	
		super(); // llamar al constructor de la clase padre heredada.
		
		//propias
		setCapacidad_carga(capacidad_carga);
		setPlazas_extras(plazas_extras);
	}
	
	public int getPrecio() {
		int precio_final= 30000;
		if (this.isAire_acondicionado()) {
			precio_final=precio_final+800;
		}
		if (this.isAire_acondicionado()) {
			precio_final=precio_final+800;
		}
		return precio_final;
	}
	
	public String getDatosFurgoneta() {
		return " la capacidad de carga es " + getCapacidad_carga() + " Y las plazas son " + getPlazas_extras();
	}
	
	public static int getCapacidad_carga() {
		return capacidad_carga;
	}

	public static void setCapacidad_carga(int capacidad_carga) {
		Furgoneta.capacidad_carga = capacidad_carga;
	}

	public static int getPlazas_extras() {
		return plazas_extras;
	}

	public static void setPlazas_extras(int plazas_extras) {
		Furgoneta.plazas_extras = plazas_extras;
	}

}
