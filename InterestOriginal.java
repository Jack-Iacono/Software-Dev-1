package lab;
import java.util.Scanner;

public class InterestOriginal{
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		double finalAmount,interestRate,initialAmount;
		int years;
		
		System.out.print("Enter Final Amount: $");
		finalAmount = scan.nextDouble();
		System.out.print("Enter Interest Rate: ");
		interestRate = scan.nextDouble();
		System.out.print("Enter Years: ");
		years = scan.nextInt();
		
		initialAmount = finalAmount/Math.pow(1+(interestRate/1200),(years*12));
		
		System.out.println("The initial amount was: $" + initialAmount);
	}
	
}
