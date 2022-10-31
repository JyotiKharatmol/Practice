package Rediff;

public class InitializeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = new int[5]; //declaration of an array and declaring the size of the array
		
		a[0]=2;
		a[1]=4;
		a[2]=5;
		a[3]=9;
		a[4]=12;//giving values to the array
		
		for(int i=0; i<a.length;i++)//reterive values of the array
		{
			System.out.println(a[i]);
		}
		
		//literal way of declaring array
		
		int b[] = {3,4,1,3,6,5,764,98,5};
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
