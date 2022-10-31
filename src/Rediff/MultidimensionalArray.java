package Rediff;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Single dimensional array
		 int a[] = new a[3];
		a[0]=1;
		 a[1]=3;
		 a[2]=6;
		 int a[] = {2,4,6,5,8,6,9,0,1};
		 
		 */
		
		// Multidimensional array
		 
		 int b[][] = new int[3][4]; //0,1 = 2 rows, 0,1,2 - 3 columns
		 
		/* 2 3 4 6
		   1 3 5 8 
		   4 7 0 1
		 */
		 
		 b[0][0] = 2;
		 b[0][1]=3;
		 b[0][2]=4;
		 b[0][3]=6;
		 
		  
		 b[1][0] = 1;
		 b[1][1]=3;
		 b[1][2]=5;
		 b[1][3]=8;
		 
		 
		 b[2][0] = 4;
		 b[2][1]=7;
		 b[2][2]=0;
		 b[2][3]=1;
		 
		
		
		
		//System.out.println(b[1][3]);
		
		int c[][] = {{1,5,4,6,7},{3,6,2,1,9},{1,6,76,3,22}}; //multidimensional array
		
	//	System.out.println(c[2][4]);
		
		for(int i=0; i<3;i++)//rows
		{
			for(int j=0;j<5;j++) //columns
			{
			
				System.out.println(c[i][j]);

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
