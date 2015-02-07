
public class MaxSubArrayProduct {

	public static int maxArray(int a[])
	{
		int dp[][] = new int[a.length][a.length];
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			dp[i][i] = a[i];
			if(a[i]>max)
				max =a[i];
		}
			
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				dp[i][j] = dp[i][j-1]*a[j];
				if(dp[i][j]>max)
					max= dp[i][j];
			}
			
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,-2,4,6,0,3};
		int x = maxArray(a);
		System.out.println(x);

	}

}
