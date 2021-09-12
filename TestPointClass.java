package LabPoint;

public class TestPointClass {
	  public static void main(String[] args) {
	    Point p1 = new Point(3, 4);
	    Point p2 = new Point(3.4, 1.4);
	    System.out.println(p1.equals(p2));
	    System.out.println(p1.equals(p1));
	    System.out.println(p1.compareTo(p2));
	    System.out.println(p2.compareTo(p1));
	  }
	}
