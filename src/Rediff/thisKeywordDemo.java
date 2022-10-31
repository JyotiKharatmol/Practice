package Rediff;

public class thisKeywordDemo  {

	
	int a=5; //global variable - => it is an object and the scope of this variable is throughout the class 
	
	public void getData()
	{
		int a=7;
		System.out.println(a+ this.a);
		//if you want to pull the global variable(scope of it is throughout the class then using this keyword you can call it in the method - local variable)
		System.out.println(this.a);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		thisKeywordDemo t = new thisKeywordDemo();
		t.getData();
		
	}

}
