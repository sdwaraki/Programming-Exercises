import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class GroupAnagrams {
	 
	public List<String> anagrams(String[] strs) 
    {
       Map<String,List<String>> m = new HashMap<String,List<String>>();
       List<String> result = new ArrayList<String>();
       for(int i=0;i<strs.length;i++)
       {
    	   String val = helper(strs[i]);
    	   if(!m.containsKey(val))
    	   {
    		   List<String> temp = new ArrayList<String>();
    		   temp.add(strs[i]);
    		   m.put(val,temp);
    	   }
    	   else
    	   {
    		   List<String> temp = m.get(val);
    		   temp.add(strs[i]);
    		   m.put(val, temp);
    	   }
       }
       
       Iterator it = m.entrySet().iterator();
       while(it.hasNext())
       {
    	   Map.Entry<Integer,List<String>> x = (Map.Entry<Integer, List<String>>) it.next();
    	   if(x.getValue().size()>1)
    		   result.addAll(x.getValue());
       }
       
       return result;
    }
	
	public String helper(String s)
	{
		char a[];
		a = s.toCharArray();
		Arrays.sort(a);
		String x = new String(a);
		return x;
	}
	public static void main(String[] args) {
		GroupAnagrams g = new GroupAnagrams();
		String [] strs = {"c","c"};
		List<String> r = g.anagrams(strs);
		for(int i=0;i<r.size();i++)
			System.out.println(r.get(i));
	}

}
