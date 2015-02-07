
public class stringBuild 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuilder s =new StringBuilder();
		String [] text = {"alan","turing"};
		for(String x : text)
		{
			s.append(x);
			s.append(' ');
		}
		System.out.println(s);
		
		String a = "GGGG";
		System.out.println(a.toLowerCase());
		
	}

}
