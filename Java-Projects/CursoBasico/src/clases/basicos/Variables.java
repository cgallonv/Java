package clases.basicos;

public class Variables {

	byte edad = 35;
	String nombre = "Carlos";
	double decimal = 0.498749;
	
	public static void main(String[] args) {
		pruebaI();
	}
	
	
	public static double pruebaMetodo(String nombre) {
		Variables pruebaVariable = new Variables();
		double prueba=pruebaVariable.decimal;
		return prueba;
	}
	
	public String pruebaMetodo2(String nombre) {
		System.out.println(nombre);
		return nombre;
	}
	
	public static void pruebaI() {
		int i = 0;
		System.out.println(i);
		i += 10;
		System.out.println(i);
	}

}
