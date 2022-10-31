package Rediff;

public class overridingChildClass extends OverridingParentClass{

	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	String name = "QA Click Academy";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		overridingChildClass o = new overridingChildClass();
		o.getStringData();
		
	}

}
