package Rediff;

public class typesOfVariablesAndDeclareMainMethod {

	String name; // instance variables - connected to the object of the class and by creating an object of the class, I can assign values to the instance variable and also call them
	String address;
	static String city="Mumbai"; // class variable
	static int i =0;
	
	
	public typesOfVariablesAndDeclareMainMethod(String name, String address)//local variable - scope of this variable is within the constructor block only
	{
		this.name=name;
		this.address=address;
		this.city=city;
		i++;
		System.out.println(i);
	}
	static //static block
	{
		String zipcode="2323";
	}
		
	
	
	public void getAddress()
	{
		System.out.println(address + " " + city);
	}
	
	
	public static void getCity()
	{
		System.out.println(city);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		typesOfVariablesAndDeclareMainMethod t = new typesOfVariablesAndDeclareMainMethod("Bob", "Kendriya Vihar");
		typesOfVariablesAndDeclareMainMethod t1 = new typesOfVariablesAndDeclareMainMethod("Jane", "Hiranandani");
		t.getAddress();
		t1.getAddress();
		t.name="Jyoti";
	//	typesOfVariablesAndDeclareMainMethod.city="Navi Mumabai";
		
		typesOfVariablesAndDeclareMainMethod.getCity();
	}

}
