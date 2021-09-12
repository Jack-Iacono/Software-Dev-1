package LabPoint;

public class Point implements Comparable<Point>{
	
	private double x,y;
	
	public Point(){
		x = 0.0;
		y = 0.0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Point p){
		
		if(p.x == x && p.y == y) {
			return true;
		}
		
		return false;
	}

	public int compareTo(Point p) {
		
		if(x > p.x || (y == p.x && y > p.y)) {
			return 1;
		}else if(x == p.x && y == p.y){
			return 0;
		}else{
			return -1;
		}
		
	}
	
}
