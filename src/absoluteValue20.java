/* 20. Get a input string. Find if it is a negative number, if true return the absolute value,
 *  in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1   
*/
public class absoluteValue20 {
	public static void findAbsolute(String s) 
	{ 
	  if (s.charAt(0)=='-') 
	    { 
	    	System.out.println("print the absolute value :  "+s.substring(1, 4)); 
	    } else
	    {
	    	System.out.println(-1);
	    }
	  
	 } 
	   
	public static void main(String[] args) 
	{ 
	  // Given integer 
	    String p = "-123"; 
	    String q = "@123";
	    
	    // Function call 
	    findAbsolute(p); 
	   findAbsolute(q);
	} 
}
