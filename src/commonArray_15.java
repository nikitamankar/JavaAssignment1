/*15. Get two integer arrays as input. Find if there are common elements in the arrays. 
 * find the number of common elements.
input1: {1,2,3,4}
input2: {3,4,5,6}
output: 4(3,4,3,4) */ 
public class commonArray_15 {
	 public static void main(String[] args){
		  int a[]={1,2,3,4};
		  int b[]={3,4,5,6};
		  int c=0;
for(int i=0;i<a.length;i++){
		for(int j=0;j<b.length;j++){
			if(a[i]==b[j])
			{
				//common elements in array
				System.out.print(a[i]+"  ");

				c++;	
			}else if(b[i]==a[j]){
				//common elements in array
						System.out.print(b[i]+"  ");
						c++;
			   }
	}
}
			System.out.println();			
			System.out.println("total common elements in array  "+c);
		  
		 
		 }
		
}
