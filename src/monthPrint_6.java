/*6. Given date in dd-MM-yyyy format.return the month in full name format(January)

input:"23-01-2012"
output:January */
import java.text.SimpleDateFormat;
import java.util.Date;

public class monthPrint_6 {
	
	
	public static void main(String[] args) throws Exception {
		String pattern="dd-MM-yyyy";
		SimpleDateFormat simple=new SimpleDateFormat(pattern);
		
		Date date=simple.parse("02-01-2020");
		
		SimpleDateFormat sdf=new SimpleDateFormat("MMMMM");
			  String d1=sdf.format(date);
			  System.out.println("Month is:"+d1);
			 }
		}
