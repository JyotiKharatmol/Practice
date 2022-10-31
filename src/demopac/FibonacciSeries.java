package demopac;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 1 2 3 5 8 13 21 34 55.......

	 int n1=0, n2=1, n3;
	 System.out.print(n1 + " " + n2);
		
	 for(int i=0; i<10; i++)
	 {
		 
		 n3 = n1 + n2; // 
		 System.out.print(" " +n3);
		
		 n1=n2;
		 n2=n3;


	 }
	 /* 0 1 = 1
	  * 1 1 = 2
	  * 
	  */
		
		
		
		
		
		
	}

}
