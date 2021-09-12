package lab;
import java.util.Scanner;

public class TestConversion {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		fahrenheitToCelsius convert = new fahrenheitToCelsius();
		
		System.out.println(convert.fahrenheit_ToCelsius(40.0));
		System.out.println(convert.fahrenheit_ToCelsius(24.0));
		System.out.println(convert.celsius_ToFahrenheit(40.0));
		System.out.println(convert.celsius_ToFahrenheit(75.0));
		
	}
	
}
