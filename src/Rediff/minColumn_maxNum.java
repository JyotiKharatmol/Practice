package Rediff;

public class minColumn_maxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* Find the min number of the array
		 * Find the min number - column
		 * Find the max number from the min number column
		 * 
		 */
		int minColumn=0;
		
		
		int a[][] = {{1,4,6,0,3},{2,4,13,10,9},{12,8,5,15,4}};
		
		int min=a[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					minColumn = j;
				}
			}
		}
		//System.out.println(minColumn);
		
		int k=0;
		int max = a[0][minColumn];
		
		while(k<3)
		{
			if(max<a[k][minColumn])
			{
				max = a[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
