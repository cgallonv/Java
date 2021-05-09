package clases.basicos;

public class Matrices {

	public static void main(String args[]) {
		int[] matriz_enteros = {1,2,3,4,5,6,7,8,9,10};
		String[] matriz_strings = new String[8];
		float[] matriz_float = {1.1f,1.2f,1.3f};
		
		System.out.println("Matriz enteros: " + matriz_enteros.length);
		System.out.println("Matriz strings: " + matriz_strings.length);
		System.out.println("Matriz float: " + matriz_float.length);
		
		matriz_strings[0] = "hola1";
		matriz_strings[1] = "hola2";
		matriz_strings[2] = "hola3";
		matriz_strings[3] = "hola4";
		matriz_strings[4] = "hola5";
		matriz_strings[5] = "hola6";
		matriz_strings[6] = "hola7";
		matriz_strings[7] = "hola8";
		
		
		
		for (int i = 0; i< matriz_enteros.length; i++) {
			System.out.println(matriz_enteros[i]);
		}
		
		System.out.println(matriz_strings.toString().toString());
		
	}

}
