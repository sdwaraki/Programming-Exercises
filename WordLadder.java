import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class WordLadder 
{

	public static void main(String[] args) 
	{
		Set<String> dict = new HashSet<String>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		String start = "hit", end ="cog";
		int value = ladderLength(start,end,dict);
		System.out.println(value);
		

	}

	private static int ladderLength(String start, String end, Set<String> dict) 
	{
		// TODO Auto-generated method stub
		int hop=1;
		Iterator<String> it = dict.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			int x = compare(start, s);
			if(x==1)
			{
				System.out.println(start + "--->" + s);
				start = s;
				hop++;
				if(compare(start, end)==1)
				{
					System.out.println(start + "--->" + end);
					hop++;
					return hop;
				}
			}
				
		}
			return hop-1;
		
		
	}

	private static int compare(String start, String target) {
		// TODO Auto-generated method stub
		
		char[] st = start.toCharArray();
		char[] en = target.toCharArray();
		int count =0;
		for(int i=0;i<st.length;i++)
		{
			if(st[i]!=en[i])
				count++;
		}
		return count;

	}

}
