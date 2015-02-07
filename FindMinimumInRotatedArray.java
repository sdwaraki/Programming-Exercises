
public class FindMinimumInRotatedArray {
	
	public static int findMin(int a[],int low,int high)
	{
		if(low<=high)
		{
			int mid = (low+high)/2;
			if(low==high)
				return a[low];
			if(a[mid]<a[mid-1])
				return a[mid];
			if(a[mid]>a[high])
				return findMin(a,mid+1,high);
			else
				return findMin(a,low,mid-1);
		}
		return a[low];
	}
	

	public static void main(String[] args) {
		int a[] = {4,5,-1,0,2};
		FindMinimumInRotatedArray f = new FindMinimumInRotatedArray();
		System.out.println(f.findMin(a, 0, a.length-1));
	}

}
