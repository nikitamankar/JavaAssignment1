import java.util.Scanner;
/*13. Get a integer array as input. Find the average of the elements which are in the position 
 * of prime index
input:{1,2,3,4,5,6,7,8,9,10}
       0,1,2,3,4,5,6,7,8,9
logic:3+4+6+8(the indeces are prime numbers)
output:21  */
public class average_13 {
	 public static void main(String[] args) {
		 //prime numbers are 2,3,5,7 out of 10
	int num[]={1,2,3,4,5,6,7,8,9,10};
	int c=0;
 for(int i=2;i<=num.length;i++) //if i start from 1 then add 2 also,2 is a prime number
	  {   int n=0;
		for(int m=2;m<i;m++)
		  {
		  if(i%m==0)            
		  {
			  n++;
		  }
		  
	 }
		 if(n==0)             //Addition of a 3,4,6,8
		  {
			  c= c+num[i];//num[i]=num[2]position=>3
		  }
  }
	  
 System.out.println("addition of the indeces are prime numbers  "+c);
}
	 

}
  




	
	
