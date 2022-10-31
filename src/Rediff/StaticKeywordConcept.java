package Rediff;

public class StaticKeywordConcept {

	
	
	/*
	 * Note :
	 * Instance variable - scope of this variable is throughout the class, can be used in different class methods
	 * 
	 * Local variable - scope of this variable is within the method or constructor defined
	 * 
	 * Class variable - these are static variable, where static variable or static methods are called using the class name itself
	 * 
	 */
	String address; //instance variable
	String name;
	String city;
	static int zipcode;
	static int i;
	
	public StaticKeywordConcept(String name, String address, String city)
	{
		this.address=address; // using this keyword, local variable are equated with instance variable
		this.name=name;
		this.city=city;	
		System.out.println(address);
		System.out.println(name);
		System.out.println(city);
		i++; // since this variable is declared as static, i=1, the second time user executes this block
		System.out.println(i);
	}
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public static void getSum() //static methods accept only static variable
	{
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticKeywordConcept s = new StaticKeywordConcept("Jyoti", "Kendriya Vihar", "Mumbai");
		StaticKeywordConcept s1 = new StaticKeywordConcept("Aman", "Jayanagar", "Banglore");
		//s1.getData(1);
		StaticKeywordConcept.zipcode=2022; //static variable are called in main method using the class name.static variable name
		System.out.println(zipcode);
		StaticKeywordConcept.getSum();
		
	}

}
