package MyFramework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

@Test
public class date {
	
	public void datenow() {
	//System.out.println("hello");
	DateFormat df = new SimpleDateFormat("ddmmyyHHmmss");
	//Date date = new Date();
	System.out.print(df.format(new Date()));

	//System.out.println(abc);
	/*DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

	//get current date time with Date()
	Date date = new Date();

	// Now format the date
	String dateFormatted= dateFormat.format(date);
	System.out.println(dateFormatted);*/
	}
}
