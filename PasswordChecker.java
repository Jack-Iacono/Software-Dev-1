package lab;
import java.util.Scanner;

public class PasswordChecker {
	
	public static boolean isPasswordValid(String password) {
		
		boolean check = true;
		int numbers = 0;
		
		if(password.length() >= 8){
			for(int i = 0; i < password.length(); i++){
				if(password.charAt(i) >= 'a'  && password.charAt(i) <= 'z') {
					//do nothing
				}else if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
					numbers++;
				}else {
					check = false;
					//System.out.print(password.charAt(i) + " is not a character");
				}
			}
		}else{
			check = false;
			//System.out.print("Not Long enough");
		}
		
		if(numbers < 2) {
			check = false;
			//System.out.print("Not enough digits");
		}
		
		return check;
	}

}
