import java.util.Scanner;
/*Que.11)Two input strings are accepted. If the two strings are of same length concat them and
 *  return, if they are not of same length, reduce the longer string to size of smaller one, 
 *  and concat them
		input1:"hello"
			input2:"hi" 
			output:"lohi"
			input1:"aaa"
			input2:"bbb"
			output:"aaabbb" */
public class LongerString_11 {
	
	public static String concatStrings(String s1,String s2){
		StringBuffer sb=new StringBuffer();
		if(s1.length()==s2.length())
			sb.append(s1).append(s2);
		else if(s1.length()>s2.length()){
			s1=s1.substring(s1.length()/2+1, s1.length());
			sb.append(s1).append(s2);
		}
		else if(s1.length()<s2.length()){
			s2=s2.substring(s2.length()/2+1, s2.length());
			sb.append(s1).append(s2);
		}
		return sb.toString();
	}
	public static void main(String[] args) {

		String s1="he";
		String s2="hi";
		System.out.println(concatStrings(s1,s2));
	}
}

