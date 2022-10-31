package Rediff;

public class ConstructorConcept {

	//default constructor
	public ConstructorConcept()
	{
		System.out.println("I am the constructor");
		System.out.println("I am the constructor explicit block");	
	}
	
	public void getData()
	{
		System.out.println("data of the application");
	}
	//parameterized constructor
	
	public ConstructorConcept(int a, int b)
	{
		System.out.println(a+b);
		
	}
	public ConstructorConcept(String s)
	{
		System.out.println(s);
	}
	
	/*Constructor
	 *do not have any return types
	 *name is the same as class names
	 *by default is constructor block will be executed, when user creates an object of the class
	 * if explicitly a constructor is not defined, then implicit constructor block will get executed
	 * 
	 */
	
	/* Parameterized Constructor
	 * It includes parameter in the constructor
	 * In the main block - you pass the values of these parameters
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ConstructorConcept c = new ConstructorConcept();
	ConstructorConcept cd = new ConstructorConcept(5,4);
	ConstructorConcept s = new ConstructorConcept("hello");
	
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
