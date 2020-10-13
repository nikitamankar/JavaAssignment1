/*QUE 1:-A number is given as input. Find the odd digits in the number, add them and find if 
 * the sum is odd or not.if even return -1, if odd return 1
input:52315
logic:5+3+1+5=14(Even)
output:-1
input:1112
logic:1+1+1=3(odd)
output:1    */
public class EvenOdd_1 {
 public static void main(String[] args) {
	    //int n=52315;
		int n=1112;
		int num,total=0;
		while(n!=0)
		{ //  %(mod) gives the remainder 
			num=n%10;         //5,1,3,2,5
			System.out.print(num+"  ");
			if((num%2)!=0){
				total=num+total;
			}
			n=n/10;    //first store 52315 then 5231,523,52,5
		}
		System.out.println();
		System.out.println("Addition of odd numbers   "+total);
		if(total%2==0)
			System.out.println("Even numbers  "+"-1");
		else
			System.out.println("Odd numbers   "+"1");
		
	}
} 
  