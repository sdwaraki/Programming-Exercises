
public class SearchMinRotatedArray {

	public int searchMin(int[] a)
	{
		int low = 0;
		int high = a.length-1;
		int mid = -1;
		
		while(low<=high)
		{
			mid = (low+high)/2;
			if(low==high)
				return a[low];
			if(a[mid]>a[high])
			{
				low = mid+1;
				continue;
			}
			if(low==mid)
				return a[low];
			
			if(a[mid]<a[mid-1])
			{
				return a[mid];
			}
			else
			{
				high = mid-1;
			}
		}
		return a[low];
		
	}
	public static void main(String[] args) 
	{
		int a[] = {4,5,6,7,0,1,2};
		SearchMinRotatedArray s = new SearchMinRotatedArray();
		System.out.println(s.searchMin(a));
		int b[] = {3,4,5,0,1};
		System.out.println(s.searchMin(b));
		int c[] = {3,1,2};
		System.out.println(s.searchMin(c));
		int d[] = {2,3,1};
		System.out.println(s.searchMin(d));
		int e[] = {4,0,1,2,3};
		System.out.println(s.searchMin(e));
		int f[] = {0,1,2,3,4};
		System.out.println(s.searchMin(f));
	}

}
