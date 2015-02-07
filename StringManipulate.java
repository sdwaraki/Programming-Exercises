import java.util.ArrayList;
import java.util.List;


public class StringManipulate {

	public static List<String> l = new ArrayList<String>();
	
	public static void checkSubString(String a)
	{
		
		for(int i = a.length()-1; i>=0;i--)
		{
			if(i==a.length()-1)
			{
				String b = a + "()";
				if(!l.contains(b))
				{
					l.add(b);
				}
				String f = a.substring(0,i);
				String g = a.substring(i);
				b = f + "()" + g;
				if(!l.contains(b))
				{
					l.add(b);
				}
			}
			if(a.charAt(i)==')')
			{
					
					String f = a.substring(0, i);
					String g = a.substring(i, a.length());
					String b = f + "()"+g;
					if(!l.contains(b))
					{
						l.add(b);
					}				
					
			}
			
		}
			
		
	}
	
	public static void main(String[] args) 
	{
		StringManipulate s = new StringManipulate();
		//String a = "(())";
		List<String> input = new ArrayList<String>();
		input.add("(())");
		input.add("()()");
		for(int j=0;j<input.size();j++)
		{
			s.checkSubString(input.get(j));
		}
		
		for(int j = 0; j<l.size();j++)
			System.out.println(l.get(j));
		
	}

}
