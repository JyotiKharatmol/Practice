package Rediff;
/*
 * Note - try block can be followed by multiple catch blocks
 *  catch block should be placed at the immediate after try block
 *  specific exception relate to the try block failure, will get executed
 *  general exception for all is Exception e
 *  finally block - will get executed irrespective of your test script being passed or failed
 *  finally block  - is written after the try block if catch block is not present
 *  
 *  
 */

public class exceptionHandleDemo {

	int a=5;
	int b=0;
	
	public void divOperation()
	{
		try
		
		{
			int c[]=new int[5];
			
			System.out.println(c[5]);
			//	System.out.println(a/b);

		}
		catch(IndexOutOfBoundsException i)
		{
			System.out.println("this is index out of bounds exception");
		}
		
		catch(ArithmeticException ae)
			{
			System.out.println("this is arithmetic exception");
			}
		catch(Exception e)
		{
			System.out.println("this is exception/e");
		}
		finally
		{
			System.out.println("delete cookies/close the browser");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionHandleDemo e = new exceptionHandleDemo();
		e.divOperation();
		
		
}
		
		
		
		
		
		
	}

/* Note - 
 * eg - when there is a pop-up occuring on landing a website, eg - advertisement, christmas, new year pop-ups 
 * and sometimes it disapper on some days
 * then we can use try to - click on the popup and catch to handle if there is no popup and 
 * avoid test script failure
 * try and catch exceptions
 * 
 * first try block will get executed
 * then catch will get executed if try fails/has an exception
 * 
 * 
 */

