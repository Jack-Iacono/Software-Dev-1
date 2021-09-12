package lab;

public class IllegalTriangleException extends Exception{
	
	double side1, side2, side3;
	
	public IllegalTriangleException(double side1, double side2, double side3){
		
		super("This triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is not a real triangle");
		
	}
	
	
	
	
	
}
