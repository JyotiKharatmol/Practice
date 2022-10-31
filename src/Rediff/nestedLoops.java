package Rediff;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1; i<=4; i++) // outer loop - it will execute 4 times
		{
			
			System.out.println("outer loop started");
			
			
			for(int j=1; j<=4; j++) // inner loop - total 16 times this loop will get execute for outer loop to get completed
			{
				
				System.out.println("inner loop");
			}
			
			
			System.out.println("outer loop ended");
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
