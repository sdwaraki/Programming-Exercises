
public class ArraySplit {

	public static void main(String args[])
	{
		int nums[] = {1,5,4,3,2,5,6,7};
		int leftSum = 0, rightSum = 0, i, j;
		  if(nums.length == 1)
		      System.out.println("No partition possible");
		  
		  for(i=0, j=nums.length-1; i<=j ;){
		      if(leftSum <= rightSum){
		         leftSum+=nums[i];
		         i++;
		      }else{
		         rightSum+=nums[j];
		         j--;
		      }
		  }
		  
		  System.out.println(rightSum);
		  System.out.println(leftSum);
		
	}
	
	
}
