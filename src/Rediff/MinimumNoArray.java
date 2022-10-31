package Rediff;

public class MinimumNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		int abc[][] = {{8,3,4,5,2},{4,7,2,0,1},{3,6,2,7,2}};
		
		 int min = abc[0][0];

		for(int i=0; i<3; i++)
		{
		
			for(int j=0; j<5; j++)
			{
			
				if((abc[i][j])<min)
				{
					min = abc[i][j];
				}
				
			}
			
		}
	
		System.out.println(min);

		
		
		
		
		
		
	}

}
