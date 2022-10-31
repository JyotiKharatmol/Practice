package Rediff;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class even_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Literal string declaration
		
		String s1 = "Jyoti Maruti Kharatmol";
		String s2 = "hello";
		
		//new operator
		
		String s3 = new String("Jyoti");
		String s4 = new String("Run");
		
		String s = "Jyoti Maruti Kharatmol";
		String[] splittedString = s.split(" ");
		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		
		String[] splitted = s.split("i");
		System.out.println(splitted[0]);
		System.out.println(splitted[1].trim());
		System.out.println(splitted[2].trim());

		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		
	
		
		

	}
	}
