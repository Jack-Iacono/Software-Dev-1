package lab;
import java.util.Scanner;

public class MatricesMult{

	public static void main(String[] args) {
		
		// TODO: Read a 3 x 3 matrix using the readMatrix() method defined in this class
		double[][] a = readMatrix();
		
		// TODO: Read another 3 x 3 matrix using the readMatrix() method defined in this class
		double[][] b = readMatrix(); 
		
		// TODO: make a call to calculate the matrix multiplication 
		// c = a X b as defined in class MatrixOperations
		double[][] c = MatrixOperations.multiplyMatrix(a,b);
		
		// TODO: print the resulting matrix using the print method in this class
		printMatrix(c);
		
	}


	private static double[][] readMatrix() {
		double[][]  matrix = new double[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3 by 3 matrix: ");
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}		
		return matrix;
	}
	

	private static void printMatrix(double[][] matrix) {
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}	
}
