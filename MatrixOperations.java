package lab;

public class MatrixOperations {

	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		
		// TODO: Create a 3 x 3 matrix 
		double[][] c = new double[3][3];
		
		/*
		 * Now, calculate the product of matrix a and b and put the result in matrix c
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// TODO: implement the expression for c[i][j] from the formula given in the lab sheet
				c[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);
			}
		}
		
		return c;
	}
}