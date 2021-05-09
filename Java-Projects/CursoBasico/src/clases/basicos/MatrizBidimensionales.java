package clases.basicos;

public class MatrizBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4*5
		int[][] matrix = { { 2, 5, 3, 6, 7, 2 }, { 9, 2, 5, 6, 7, 7 }, { 1, 5, 6, 8, 2, 4 },
				{ 5, 7, 3, 5, 7, 8 }, { 1, 2, 3, 4, 5, 6 } };

		for (int[] fila : matrix) {
			for (int z : fila) {
				System.out.print(z + " ");
			}
			System.out.println();
		}

	}

}
