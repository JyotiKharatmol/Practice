package Rediff;

public class FunctionOverloadingClass


// Multiple methods with same method name is allowed only when
//1. argument count is different
//2. argument data is different
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionOverloadingClass c = new FunctionOverloadingClass();
		c.getData(1);
		c.getData("hello");
		c.getData(1, 3);
		
	}

	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
		
	}
	public void getData(int a, int b)
	{
		System.out.println(a+b);
	}
	
}
