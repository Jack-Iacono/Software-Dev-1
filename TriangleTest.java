package lab;

public class TriangleTest {

	public static void main(String[] args) {
		
		try{
			Triangle t1 = new Triangle(3.0,4.0,10.0);
		}catch(IllegalTriangleException e) {
			System.out.print(e);
		}
		
	}
	
}
