package demopac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> h = new HashMap<Integer, String>(); //stores the elements in - key, value format
		
		h.put(2, "Hello");    // put method is used to add values to the hashmap collections
		h.put(0, "Good morning");
		h.put(1, "Good evening");
		h.put(3, "Thank you");
		h.put(7, "Health is imp");
		
		System.out.println(h);
		
		System.out.println(h.get(9));
		
		System.out.println(h.size());
		System.out.println(h.remove(7));
		System.out.println(h.size());
		System.out.println(h);
		System.out.println(h.put(7, "Health is imp"));

		Set hs = h.entrySet(); //set the values from 0th index to nth index
		
		Iterator i = hs.iterator(); //iterator will store 0 th nth index
		
		
		while(i.hasNext())
		{
			Map.Entry m =(Map.Entry)i.next(); // in each block - eg - 0th index - two values will be stored - key and value
											//Map.Entry - to divide the storage in two parts and explicity point out to one of block to be printed in output
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
			
		}
		
		
		
	}

}
