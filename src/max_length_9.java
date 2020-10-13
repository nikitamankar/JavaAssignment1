
import java.util.StringTokenizer;
/*9. find the max length-word in a given string and return the max-length word. if two words
 *  are of same length return the first occuring word of max-length
input:"hello how are you aaaaa"
output:hello(length-5) */
public class max_length_9 {
public static void main(String[] args) {
        int max=0;
		String s2=null;
		String s1="hello how are you aaaaa";
		 StringTokenizer t=new StringTokenizer(s1," ");
	        while(t.hasMoreTokens()){
	        	s1=t.nextToken();
	        int n=s1.length();
	        	if(n>max){
	        		max=n;
	        		s2=s1;
	        		
	        		}
	        }
	 System.out.println(s2);
	 System.out.println(max);
	}

}
