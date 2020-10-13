import java.util.StringTokenizer;

public class extensionString_14 {
	public static String extensionString(String s1){
		  StringTokenizer t=new StringTokenizer(s1,".");
		  t.nextToken();  //hello
		  String s2=t.nextToken();//jpeg
		  return s2;
		 }
	 public static void main(String[] args) {
		  String s1="hello.jpeg";
		  System.out.println(extensionString(s1));
		 }

}
