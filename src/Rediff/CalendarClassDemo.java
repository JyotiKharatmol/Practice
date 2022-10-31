package Rediff;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
				Calendar c = 	Calendar.getInstance();
				
				SimpleDateFormat s = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
				
				System.out.println(s.format(c.getTime()));
				
				
				System.out.println(c.get(Calendar.AM));
				System.out.println(c.get(Calendar.DAY_OF_MONTH));
				
				System.out.println(c.get(Calendar.HOUR));
				
				System.out.println(c.get(Calendar.SECOND));
				
				System.out.println(c.get(Calendar.DATE));
				
				System.out.println(c.get(Calendar.MONTH));
				
		
		
		
		
		
		
		
		
		
	}

}
