/*4.Given two arrayslist. retrieve the odd position elements form first input and even position 
 * elemetns from second list.put it into the new arraylist at the same positions from where 
 * they are retrieved from.
(consider 0th position as even position, and two lists are of same size)
input1:{12,1,32,3}
input2:{0,12,2,23}
output:{0,1,2,3} */
public class twoArray_4 {
	public static void main(String[] args) {
		int[] a={12,1,32,3};
		  int[] b={0,12,2,23};
		  
		  int[] c=new int[a.length];
		 
		  for(int i=0;i<a.length;i++){
		   if(i%2==0)
		    c[i]=b[i];
		   else
		  c[i]=a[i];
		   }
		  
		 for(int i=0;i<c.length;i++){ 
		 
		   System.out.print(" "+c[i]);
		  }
}
}
