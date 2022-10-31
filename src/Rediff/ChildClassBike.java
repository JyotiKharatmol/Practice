package Rediff;

public class ChildClassBike extends ParentClassBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClassBike c = new ChildClassBike();
		c.audioSystem();
		c.brakes();
		c.wheels();
		c.color();
	}
	public void color()
	{
		System.out.println(color);
	}
	public void audioSystem() //over riding concept - where parent class audioSystem method is overridden by child class method
	//Note - in overriding, method name, argument, parameters are same but the method get overridden by a class.
	
	{
		System.out.println("new audio");
	}

}
 
/* Notes
 * 1. Inheritance uses extends keyword to inherit the parent class methods to class class
 * 2. By creating an object of the child class, we can access the methods present in the parent class
 * 3. Multiple inheritances is not possible
 * childclass extends parentclass, otherpatherclass
 * 
 * 4. if in parent class, int a = 10;
 * and in child class also we have, int a = 20;
 * then in the main class, when we write, P a = new C; //output =10
 * where p = parent class, c= child class
 * then "a" is an object of child class, we will have access to the properties/methods defined in the parent class
 * 
 * 
 */


