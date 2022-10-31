package demopac;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	/*Note
	 * Hashset, TreeSet, Linked Set are classes that implement the methods given in Set interface
	 * Set interface - does not accept duplicate values
	 * Set interface - it is not necessary that the added values are in the sequential order, it will be in the random order
	 * Set interface -iterator method will be used to iterate over all the elements present in the set interface, which will be in random order
	 * Set interface - applications usage - when you want to restrict duplicate values 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> h = new HashSet<String>();
		System.out.println(h.isEmpty());
		
		h.add("UK");
		h.add("USA");
		h.add("INDIA");
		h.add("SOUTH AFRICA");
		h.add("UK");
		h.add("SOUTH AFRICA");
	
		System.out.println(h);
		
		System.out.println(h.isEmpty());
		
		System.out.println(h.size());
		
		h.remove("UK");
		System.out.println(h);
		System.out.println(h.contains("INDIA"));
		h.add("HELLO");
		h.add("BRAZIL");
		h.add("FRANCE");
		System.out.println(h);
	
		//Iterator - will be used to iterate over all the elements/object present in the set interface
		
		Iterator<String> i =h.iterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
	
		while(i.hasNext())
		{
			System.out.println(i.next());
		}	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
