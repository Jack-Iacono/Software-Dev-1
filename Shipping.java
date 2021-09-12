package lab;

import java.util.Scanner;

public class Shipping {
	
	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Please Enter Package Weight: ");
			double weight = scan.nextDouble();
			
			if(weight <= 2) {
				System.out.print("Cost: $2.50");
			}else if(weight <= 4) {
				System.out.print("Cost: $4.50");
			}else if(weight <= 10) {
				System.out.print("Cost: $7.50");
			}else if(weight <= 20) {
				System.out.print("Cost: $10.50");
			}else {
				System.out.print("Package Cannot Be Shipped");
			}
			
	}
}
