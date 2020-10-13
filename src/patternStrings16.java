/*Q.16 Find if a given pattern appears in both the input strings at same positions.
input1: "hh--ww--"
input2: "rt--er--"
output: true(false otherwise)*/
public class patternStrings16 {
public static void main(String []args){ 
        String s1 = "hh--ww--";  
        String s2 = "rt--er--";
        
        int index1=0;
        int index2=0;
        char c='-';
        for(int i=0;i<s1.length();i++){
             if(c==s1.charAt(i))
    			{   
            	    index1=i;
    				System.out.println(index1);
    			}
    		}
         for(int j=0;j<s2.length();j++){
        	    
    			if(c==s2.charAt(j))
    			{
    				index2=j;
    				System.out.println(index2);
    			}
    		}
         if(index1==index2)
			 System.out.println("true");
         else
        	 System.out.println("False");
        }
}
