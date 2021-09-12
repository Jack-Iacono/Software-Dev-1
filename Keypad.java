package lab;
import java.util.Scanner;

public class Keypad {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String num = "";
		
		System.out.print("Please Enter a Letter: ");
		String in = scan.nextLine().toLowerCase();
		
		char letter = in.charAt(0);
		
		switch(letter) {
		
			case 'a','b','c':
				num = "2";
				break;
			case 'd','e','f':
				num = "3";
				break;
			case 'g','h','i':
				num = "4";
				break;
			case 'j','k','l':
				num = "5";
				break;
			case 'm','n','o':
				num = "6";
				break;
			case 'p','q','r','s':
				num = "7";
				break;
			case 't','u','v':
				num = "8";
				break;
			case 'w','x','y','z':
				num = "9";
				break;
		
		}
		
		System.out.print("The Corresponding Number is " + num);
		
	}
	
}
