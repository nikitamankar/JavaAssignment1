import java.util.Date;
import java.text.*;
/*2.Find the day(Friday) of a date input given as MM-dd-yyyy (format)
input:12-27-2012
output:Thursday */
public class LocalDate_2 {
		 
	
public static void main(String[] args) throws Exception {
	String pattern="MM-dd-yyyy";
	SimpleDateFormat simple=new SimpleDateFormat(pattern);
	
	Date date=simple.parse("12-27-2012");//String to date
	
	
	SimpleDateFormat sdf=new SimpleDateFormat("EEEE");
		  String d1=sdf.format(date);//date to String
		  System.out.println("day is:"+d1);
		 }
	}
