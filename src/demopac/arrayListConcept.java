package demopac;

import java.util.ArrayList;

public class arrayListConcept {

	/*Note :
	 * 1. Array list is a class which contains a set of methods
	 * 2. Parameter passed inside the array list will be type of data you feed inside an array
	 */
	/* Array List, LinkedList, Vector - classes that implement the methods which are present in List Interface
	 * Allows duplicate the fed inside the array list
	 * Arrays - have fixed size
	 * Array list - the size of the list can grow dynamically
	 * Array list - can access any value present in the array list index and add/remove/get/empty/size/contains/check index of and performs operations on it
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(2); //add the values inside the array list easily using add method
		a.add(7);
		a.add(8);
		System.out.println(a);
		a.add(0, 3); //explicitly provide a value to an index of an array
		
		System.out.println(a);
		a.remove(2); //remove any element from any of the nth position inside the array list
		System.out.println(a);
		a.add(10);
		try
		{
			a.get(3);
		}
		catch(IndexOutOfBoundsException b)
		{
			System.out.println("index out of bounds exception");
		}
		finally
		{
			System.out.println(a);
		}
		System.out.println(a.contains(80));
		*/
		ArrayList<String> s = new ArrayList<String>();
		s.add("jyoti");
		s.add("java");
		s.add("academy");
		System.out.println(s);
		s.remove(0);
		System.out.println(s);
		System.out.println(s.contains("academy"));
		System.out.println(s.get(0));
		s.add(0, "testing");
		s.add("java");
		System.out.println(s);
		
		
		
		System.out.println(s.size()); //size of an array

		System.out.println(s.indexOf("academy"));// get the index of a value present in the array list

		System.out.println(s.isEmpty()); //check if the array list is empty - boolean output - true or false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
