/*19. Find no of characters in a given string which are not repeated.
input: "hello"
output: 3 */
public class charcString19 {
	public static int nonRepeatedCharacters(String s1){
		  StringBuffer sb=new StringBuffer(s1);
		  for(int i=1;i<sb.length();i++){
		   int n=0;
		   for(int j=i+1;j<sb.length();j++)
		    if(sb.charAt(i)==sb.charAt(j)){
		     sb.deleteCharAt(j);
		     n++;
		     }
		    if(n>0){
		     sb.deleteCharAt(i);
		     i--;
		     }  
		    }
		  System.out.println(sb);
		  return sb.length();
		 }
		public static void main(String[] args) {
		  String s1="hello";
		 
		  System.out.println(nonRepeatedCharacters(s1));
		 }
}