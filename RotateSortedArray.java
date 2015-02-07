
public class RotateSortedArray {

	public void rotate(int a[])
	{
		int pivot =0;
		int cl = 0;
		int temp = 0;
		int temp1 = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[i+1])
			{
				pivot = i+1;
				break;
			}	
		}
		
		for(int i = pivot;i<a.length;i++)
		{
			int j = i-1;
			while(j>=cl)
			{
				if(a[i]<a[j] && j>cl)
				{
					j--;
				}
				else
				{
					temp = a[i];
					for(int k=j;k<=i;k++)
					{
						temp1 = a[k];
						a[k]=temp;
						temp=temp1;
					}
					break;
				}
			}
			cl++;
		}
		
		for(int i =0 ; i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		int a[] = {4,5,7,0,1,2};
		
		RotateSortedArray r = new RotateSortedArray();
		r.rotate(a);
		
		
		
	}

}
