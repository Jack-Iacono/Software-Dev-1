package lab;

public class Triangle {
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

	/** Constructor */
	public Triangle() {
	}

	/** Constructor */
	// Note that you will see a compilation error here until you define the exception class in part 1 of the lab.
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		if(side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
			throw new IllegalTriangleException(side1,side2,side3);
		}
		
		// Implement the triangle rule: In a triangle, the sum of any two sides is greater than the other side. 
		// The Triangle class must adhere to this rule. Otherwise, throw an IllegalTriangleException exception
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public String toString() {
		// Implement it to return the three sides
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
				+ side3;
	}
}
