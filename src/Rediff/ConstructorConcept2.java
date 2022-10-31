package Rediff;

public class ConstructorConcept2 {
	
	//default constructor
	
	public ConstructorConcept2()
	{
		System.out.println("I am the default constructor");
	}
	
	//parameterized constructor
	
	public ConstructorConcept2(int a, int b)
	{
		System.out.println(a+b);
		System.out.println("I am the parameterized constructor");
	}
	public ConstructorConcept2(String str)
	{
		System.out.println(str);
	}
	
	public void getData()
	{
		System.out.println("get data from the application");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConstructorConcept2 c = new ConstructorConcept2();
		ConstructorConcept2 c1 = new ConstructorConcept2(3,6);
		ConstructorConcept2 c2 = new ConstructorConcept2("hello");
		
		/*Note :
		 * Constructor does not have any return type
		 * Constructor is created using the name of the class itself
		 * By default, if an explicit constructor is not created then implicit constructor will get executed
		 * Explicit constructor have to be called in the main program, to get executed
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
