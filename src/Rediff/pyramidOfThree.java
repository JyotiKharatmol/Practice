package Rediff;

public class pyramidOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*3
		 *6  9
		 *12 15 18
		 */
		int k=3;
		int l=1;
		for(int i=1; i<4; i++)
		{
			
			for(int j=0; j<i ; j++)
			{
				System.out.print(k*l);
				l++;
				System.out.print("\t");
			}
			System.out.println("");
		}
		
	}

}
