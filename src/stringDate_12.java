import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
/*12. accept a string and find if it is of date format "dd/mm/yyyy".
input:01/13/2012
output:false */
public class stringDate_12 {
public static void main(String[] args) {
		boolean b1=false;
	String s="01/11/2012";
	StringTokenizer t=new StringTokenizer(s,"/");
	int n1=Integer.parseInt(t.nextToken());
	System.out.println(n1);//     "/" date
	int n2=Integer.parseInt(t.nextToken());
	System.out.println(n2);//     "/" month
	String s2=t.nextToken();
	System.out.println(s2);
	int n3=Integer.parseInt(s2);
	System.out.println(n3);
    int n4=s2.length();
    System.out.println(n4);
	if(n4==4)
	{
		if(n3%4==0)
		{
			if((n2==1)&&(n1<=29))
				b1=true;
			else if((n2<=12)&&(n1<=31))
				b1=true;
	    } else 
		{
			if((n2==1)&&(n1<=28))
				b1=true;
			else if((n2<=12)&&(n1<=31))
				b1=true;
		}
	}
	if(b1==true)
		System.out.println("date is in dd/MM/yyyy format");
	else
		System.out.println("date is not in dd/MM/yyyy format");
	}

}
