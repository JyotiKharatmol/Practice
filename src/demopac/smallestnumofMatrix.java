package demopac;

public class smallestnumofMatrix {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  10  2  5
		 *  4   6  8
		 *  3   9  1
		 */
		
		int a[][] = {{10,2,5},{4,6,8},{3,9,1}};
		
		
		 int min = a[0][0];
		 int minRow = 0;
		 int k=0;
		 int max = a[0][2];

		
		for(int i=0; i<3 ; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(min>a[i][j])
				{
					min=a[i][j];
					minRow = j;	
				}
			}
		}
		while(k<3)
		{
			if(max<a[k][minRow])
			{
				max = a[k][minRow];
			}
			k++;
			
		}
		System.out.println(max);
	}

}
