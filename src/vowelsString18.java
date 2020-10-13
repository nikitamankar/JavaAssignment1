import java.util.Scanner;
/*18.  Check whether a given string is palindrome also check whether it has atleast 2 
 * different vowels
input: "madam"
output: false(no 2 diff vowels)
*/
/*Palindrome:-A palindrome is a word, number, phrase, or other sequences of characters which 
 * reads the same backward as forward. ... If both of the letters have the same sequence of 
 * characters, i.e., they are identical then the string is a palindrome otherwise not.
 */
public class vowelsString18 {
 public static void main(String args[])
		    {
	            String a ="madam";
		        String  b = "";
		      
		        System.out.println(a);
		        
		        int n = a.length();
		        for(int i = n - 1; i >= 0; i--)
		        {
		            b = b + a.charAt(i);
		        }
		        if(a.equalsIgnoreCase(b))
		        {
		            System.out.println("The string is palindrome.");
		        }
		        else
		        {
		            System.out.println("The string is not palindrome.");
		        }
		    }
}
