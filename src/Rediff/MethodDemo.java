package Rediff;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo d = new MethodDemo();
		String s = d.Login();
		System.out.println(s);
		MethodDemo2 d1 = new MethodDemo2();
		String s1 = d1.LoginInfo();
		System.out.println(s1);
		app();
		accessModifiers a = new accessModifiers();
		System.out.println(a.a);
		a.getData();
		
		
	}
	
	
	
	public String Login()
	{
		System.out.println("You are logged in");
		return "Jyoti Kharatmol";	
	}
	
	public static void app()
	{
		System.out.println("web application");
	}
	
	

}
