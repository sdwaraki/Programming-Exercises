import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class MinimumCoinSum {

	public int minCoin(List<Integer> denom, int n)
	{
		
		if(n<0 || n<denom.get(0))
			return Integer.MAX_VALUE-1;
		if(denom.contains(n)){
			return 1;
		}
		
		int min = Integer.MAX_VALUE-1;
		int valc;
		for(int c:denom)
		{
			valc = minCoin(denom,n-c)+1;
			if(valc<min)
				min = valc;
			
		}
		return min;
		
	}
	
	
	public static void main(String[] args) {
		MinimumCoinSum h = new MinimumCoinSum();
		List<Integer> k = new ArrayList<Integer>();
		k.add(2);
		k.add(3);
		k.add(5);
		System.out.println(h.minCoin(k,31));
		
	}

}
