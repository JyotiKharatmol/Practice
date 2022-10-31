package Rediff;

public class while_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 0;
		
		while(i<=10)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
			
		}
		
		
		//while loop - condition at the beginning and I need to perform some operations on the condition, or else it will go into infite loop
		
		int j = 20; 
		
		do
			
		{
			System.out.println(j);
			j++;
		}
		while(j<20);
		
	//1 loop of execution is guaranteed.
		
		
		
	}

}
