

public class _1_8_zeroMatrix {
	public static void setZeros(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;
		int nR = matrix[0].length;
		int nC = matrix.length;
		for(int i = 0; i < nR; i++) {
			if(matrix[0][i] == 0) {
				rowHasZero = true;
				break;
			}
		}
		
		for(int j = 0; j < nC; j++) {
			if(matrix[j][0] == 0) {
				colHasZero = true;
				break;
			}
		}
		
		for(int i = 1; i < nR; i++) {
			for(int j = 1; j < nC; j++) {
				if(matrix[j][i] == 0) {
					matrix[j][0] = 0;
					matrix[0][i] = 0;
				}
			}
		}
		
		for(int i = 1; i < nR; i++) {
			if(matrix[0][i] == 0) {
				nullifyCol(matrix, i);
			}
		}
		for(int j = 1; j < nC; j++) {
			if(matrix[j][0] == 0) {	
				nullifyRow(matrix, j);
			}
		}
		if(rowHasZero) {
			nullifyRow(matrix, 0);
		}
		if(colHasZero) {
			nullifyCol(matrix, 0);
		}
	}

	private static void nullifyCol(int[][] matrix, int col) {
		int nC = matrix.length;
		for(int j = 0; j < nC; j++) {
			matrix[j][col] = 0;
		}
		
	}

	private static void nullifyRow(int[][] matrix, int row) {
		int nR = matrix[0].length;
		for(int i = 0; i < nR; i++) {
			matrix[row][i] = 0;
		}
	}
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}

	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		return matrix;
	}
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int nrows = 10;
		int ncols = 15;
		int[][] matrix = randomMatrix(nrows, ncols, -10, 10);		

		printMatrix(matrix);
		
		setZeros(matrix);
		
		System.out.println();
		
		printMatrix(matrix);
	}
}

