package lab;

public class Pi {
	
	public static void main(String[] args) {
		
		double x,y,pi;
		int numberOfHits = 0;
		
		for(int i = 0; i < 1000000; i++) {
			
			x = Math.random() * 2 - 1;
			y = Math.random() * 2 - 1;
			
			if(Math.pow(x,2) + Math.pow(y, 2) < 1){
				numberOfHits++;
			}
			
		}
		
		pi = 4 * numberOfHits / 1000000.00;
		
		System.out.print(pi);
		
	}
	
}
