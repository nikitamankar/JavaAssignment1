import java.util.Arrays;
/*3.A integer array is given as input. find the difference between each element. Return the 
 * index of the largest element which has the largest difference gap.
input: {2,3,4,2,3}
logic: 2-3=1,3-4=1,4-2=2,2-3=1
2 is the max diff between 4 and 2,return the index of 4 i.e 2
output:2 */
public class arrayMaxDiff_3 {
	public static void main(String[] args) {
       int[] array_nums = {2,3,4,2,3};
      
		System.out.println("Original Array: "+ Arrays.toString(array_nums)); 
		int max_val = array_nums[0];
	    int min_val = array_nums[0];
	    
		for(int i = 1; i < array_nums.length; i++)
		{
			if(array_nums[i] > max_val)    //3>2;4>3
				max_val = array_nums[i];    //3,4
			
			else if(array_nums[i] < min_val)//2<2;3<2
				min_val = array_nums[i];//2,2
		}
		System.out.println("Maximum Number is   "+max_val);
		System.out.println("Minimum Number is   "+min_val);
System.out.println("Difference between the largest and smallest values of the said array: "
		+(max_val-min_val));	
	 }
}
	


