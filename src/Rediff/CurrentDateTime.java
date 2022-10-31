package Rediff;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//current date and time
		
		Date d = new Date();
		
		System.out.println(d.toString());
		
		SimpleDateFormat s = new SimpleDateFormat("M/dd/yyyy");
		
		System.out.println(s.format(d));
		
		SimpleDateFormat s1 = new SimpleDateFormat("M/dd/yyyy HH:mm:ss");
		
		System.out.println(s1.format(d));
		
	}

}
