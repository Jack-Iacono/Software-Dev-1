package lab;
import java.util.Scanner;

public class Line {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a,b,c,d;
		
		System.out.print("Please Enter Cooridinates for two points: ");
		String in = scan.nextLine();
		
		String[] strArray = in.split(" ", 4);
		
		a = Double.parseDouble(strArray[0]);
		b = Double.parseDouble(strArray[1]);
		c = Double.parseDouble(strArray[2]);
		d = Double.parseDouble(strArray[3]);
		
		double slope = (d-b) / (c-a);
		
		System.out.print("The slope is: " + slope);
	}
	
}
