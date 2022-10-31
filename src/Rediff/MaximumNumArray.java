package Rediff;

public class MaximumNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int a[][] = {{1,4,5,6,8},{3,2,5,6,73},{3,1,4,6,7}};
		
		
		int max = a[0][0];

		
		for(int i=0; i<3; i++)
			
		{
			for(int j=0; j<5; j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
