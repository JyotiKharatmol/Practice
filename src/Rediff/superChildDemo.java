package Rediff;

public class superChildDemo extends superParentDemo{

	String name = "QA Click Academy";
	
	
	/*Note
	 * Using the super keyword, the same variable, method, cosntructor defined in the parent class can be pointed
	 * for variable - super.name - example
	 * for method - super.getData() - example
	 * for constructor - using super() function
	 * This is how over ridden data can be avoided.
	 * By default- java calls the variable, method defined in the local/child class, to explicitly call the parent class variables, methods, constructor, use super keyword.
	 * 
	 */
	
	public superChildDemo()
	{
		super(); //constructor call must be the first line the constructor method
		System.out.println("child class constructor");
	}
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name); //super keyword will point to the variable defined in the parent class. It will overriding feature.
		
	}
	public void getData()
	{
		System.out.println("get data of the child class");
		super.getData();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		superChildDemo s = new superChildDemo();
		s.getStringData();
		s.getData();
	}

}
