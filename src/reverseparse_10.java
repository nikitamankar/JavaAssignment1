import java.util.Scanner;
/*10. Get a input string. reverse it and parse it with '-'.
input:computer
     *  1 3 5 7 9 11 13  *
output:r-e-t-u-p-m-o-c */
public class reverseparse_10 {
	
	public static void main(String[] args) {
		  
		String s1="computer";
		StringBuffer sb=new StringBuffer(s1);
		  sb.reverse();              //retupmoc
		  System.out.println("Print the reverse of a String    "+sb);
		  for(int i=0;i<(2*s1.length()-1);i++) //increase length
		   if(i%2!=0)   //0 1 2 3 4 5 7 
		    sb.insert(i, '-');
		  System.out.println(sb);
		 }


}
