package lab;

public class fahrenheitToCelsius {
	
	//Odd naming conventions due to name of the class
	
	public static double celsius_ToFahrenheit(double celsius) {
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		return fahrenheit;
	}
	
	public static double fahrenheit_ToCelsius(double fahrenheit){
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		
		return celsius;
	}
	
}
