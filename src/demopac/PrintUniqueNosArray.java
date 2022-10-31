package demopac;

import java.util.ArrayList;

public class PrintUniqueNosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,3,3,3,4,4,5,6,6,7,7,8,8,9,0,0,2};
		
		//print how many times each number is repeated and which number is unique
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		
		for(int i=0; i<a.length; i++)
		{
			int k=0;
			if(!b.contains(a[i]))
			{
				b.add(a[i]);
				k++;
				
				for(int j=i+1; j<a.length; j++)
				{
					if(a[j]==a[i])
					{
						k++;
					}
				}
				if(k>1)
				{
				System.out.println(a[i]+" is repeating "+ k+ " number of times");	
				}
				
			if(k==1)
			{
				System.out.println(a[i]+" is a unique number");
			}	
			
		}
		
		
		
		
		
	}

}
}
