package lab;

public class Sum {
	
	public static void main(String[] args) {
		
		double sum = 0.0;
		
		for(int i = 1; i <= 49; i++) {
			sum = (2 * i - 1.0) / (2 * i + 1.0);
		}
		
		System.out.print("Sum is " + sum);
		
	}
	
}
