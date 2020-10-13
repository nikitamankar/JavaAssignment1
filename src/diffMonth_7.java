import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*7. Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between 
 * the two dates
input1:"2012-12-01"
input2:"2012-01-03"
output:11 */
public class diffMonth_7 {
	
		 public static void main(String[] args) throws ParseException {
			 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			  Calendar c=Calendar.getInstance();
			  Date d1=sdf.parse("2012-12-01");
			  Date d2=sdf.parse("2012-01-03");
			  c.setTime(d1);
			  int m1=c.get(Calendar.MONTH)+1;
			  System.out.println(m1);
			  int y1=c.get(Calendar.YEAR);
			  c.setTime(d2);
			  int m2=c.get(Calendar.MONTH)+1;
			  System.out.println(m2);
			  int y2=c.get(Calendar.YEAR);
			  int n=(m2-m1);
	
			  System.out.println("Difference between Two dates   "+n);
			 
		
		 }
		

	
		
	
}
