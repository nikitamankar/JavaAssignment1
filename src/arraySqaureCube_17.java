import java.util.StringTokenizer;

/*17.  Input a int array. Square the elements in even position and cube the elements in 
 * odd position and add them as result.
input: {1,2,3,4}
output: 1^3+2^2+3^3+4^2  */ 
public class arraySqaureCube_17 {
	
		public static void main(String[] args) {
	      int a[]={1,2,3,4};
	      
	      
		int n1=0,n2=0;
		  
		  for (int i=0;i<a.length;i++)
			  if(i%2==0)
				  n1=n1+(a[i]*a[i]*a[i]);
			else
				  n2=n2+(a[i]*a[i]);
		  
		  System.out.println("Addition of the Square and cube of the elements  "+(n1+n2));
		  
			
		 }
		

		

}
