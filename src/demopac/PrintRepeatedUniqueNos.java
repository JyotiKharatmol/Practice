package demopac;

import java.util.ArrayList;

public class PrintRepeatedUniqueNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,1,4,8,7,9,10,12,4,3,8,7,12,1,8,7,9};
		
		//print the unique and repeated nos from the array - amazon question
		
		/* 1. Push the nos in array list - b, if they haven't been added
		 * 2. increment the count by 1
		 * 3. compare this nos with other elements present in the array
		 * 4. increment the count by 1
		 * 5. print the nos which repeating and are unique separately
		 */ 
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
				System.out.println(a[i] + " is repeating "+ k +" times");
			}
			else
				System.out.println(a[i]+ " is a unique no");
				
					}
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
