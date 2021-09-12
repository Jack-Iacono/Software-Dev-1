package lab;

import java.util.Scanner;

	public class InCircle {
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Please Enter Point: ");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			
			double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
			
			if(dist < 10) {
				System.out.print("Point ("+x+", "+y+") is in Circle");
			}else {
				System.out.print("Point ("+x+", "+y+") is not in Circle");
			}
	}
	
}
