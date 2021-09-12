package lab;
import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] nums = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Enter number: ");
			nums[i] = scan.nextDouble();
			
		}
		
		System.out.println("Mean is: " + mean(nums));
		System.out.println("Standard Deviation is: " + standardDeviation(nums, mean(nums)));
		
		
	}
	
	public static double mean(double[] nums) {
		
		double total = 0.0;
		
		for(int i = 0; i < 10; i++) {
			
			total += nums[i] * 1.0;
			
		}
		
		return total / 10;
	}
	
	public static double standardDeviation(double[] nums, double mean) {
		
		double b = 0.0;
		
		for(int i = 0; i < 10; i++) {
			
			b += Math.pow(nums[i] - mean, 2);
			
		}
		
		return Math.sqrt(b / 9);
	}
	
}
