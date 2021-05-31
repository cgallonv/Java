package clases.objetos;


public class UsoVehiculo {

	public static void main(String args[]) {
//		Carro renault = new Carro();
//		renault.setAire_acondicionado(true);
//		renault.setAsientos_cuero(true);
//		renault.setColor("Azul");
//		renault.setPeso_total(2050);
//prueba
		Furgoneta van = new Furgoneta(1100, 5);
		van.setAire_acondicionado(false);
		van.setAsientos_cuero(false);
		van.setColor("Gris");
		van.setPeso_total(3000);

		//System.out.println("Tu carro es de color: " + renault.getColor() + " Y vale: " + renault.getPrecio());
		System.out.println("Tu Furgoneta es de color: " + van.getColor() + " Y vale: " + van.getPrecio()
				+ van.getDatosFurgoneta());
		
		//regla de herencia. "Es un..." Una furgoneta ES UN vehiculo.

	}

}
