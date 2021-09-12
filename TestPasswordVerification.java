package lab;
import java.util.Scanner;

public class TestPasswordVerification {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter password: ");
		String password = scan.nextLine();
		
		if(PasswordChecker.isPasswordValid(password)) {		
			System.out.print(password + " is a valid password");
		}else if(!PasswordChecker.isPasswordValid(password)) {
			System.out.print(password + " is not a valid password");
		}
		
	}
	
}
