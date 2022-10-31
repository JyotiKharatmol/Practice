package demopac;

import Rediff.CalendarClassDemo;
import Rediff.accessModifiers;

public class demo1 extends accessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalendarClassDemo c = new CalendarClassDemo(); //create an object of a class to access the methods present in it.
		//If you want to access the methods of a class which is present in a different package, then you need to import the package by package name.class name in your class 
		// user defined package - package name.class name
		//default package - java.lang
		// in build package - java.io, java.util.class name
		
		c.main(args);
		
	//accessModifiers a = new accessModifiers();
		
		demo1 d = new demo1();
		System.out.println(d.a);
		d.getData();
		
		
		
	}

}
