package Rediff;

public class ChildAirCraft extends ParentAirCraft{

	
	
	/*int x[][] = {{1,2,3,5},{30,6,3,2}};
	
	int y[][] = new int[3][4];
	
	
	
	b[0][0]=2;
	b[0][1]=1;
	b[0][2]=4;
	*/
	
	
			
	
	
	
	public static void main(String[]args)
	{
		
		
		ChildAirCraft c = new ChildAirCraft();
		c.engine();
		c.safetyGuidelines();
		c.bodycolor();
		
		//ParentAirCraft p = new ParentAirCraft();
		
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
	
		System.out.println("Red color to the body");
		
	}
}


/* Abstract info :
 * 1. Abstract class is a "combination of concerte (methods with body) and non-concrete methods (abstract methods)"
 * 2. Apart from "private", all other access modifiers(public, protected) are allowed to be given to the methods.
 * 3. "You can not create an object" of an abstract class, to access the methods present in it.
 * 4. Child class, is forced to implement the methods defined in the abstract class
 * 5. Using "extends" keyword, inheritance concept of accessing parent to child class is done.
 * 
 */









