import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RemoveDuplicatesFromSortedArray {
	
	 public static int removeDuplicates(int[] A)
	 {
		 List<Integer> l = new ArrayList<Integer>();
		 if(A.length==0)
		 {
			 return 0;
		 }
		 else if(A.length==1)
		 {
			 return 1;
		 }
		 else if(A.length==2)
		 {
			 return 2;
		 }
		 else
		 {	 
			 for(int i=0;i<A.length;i++)
			 {
				 l.add(A[i]);
			 }
	     
			 for(int i=0;i<l.size()-2;i++)
			 {
		    	 if(l.get(i)==l.get(i+1))
		    	 {
		    		 if(l.get(i+1)==l.get(i+2))
		    		 {
		    			 int j =i+2;
		    			 while(l.get(j)==l.get(i))
		    			 {
		    				 int k=j;
		    				 l.remove(k);
		    				
		    			 }
		    			 i=i+2;
		    			 continue;
		    		 }
		    		 i=i+2;
		    	 }
			 }
		 }
	     
	     for(int p=0;p<l.size();p++)
	    	 System.out.print(l.get(p)+ " ");
	 
		 return l.size();
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,1,1};
		
		int x = removeDuplicates(A);
		System.out.println("\n"+x);
	}

}
