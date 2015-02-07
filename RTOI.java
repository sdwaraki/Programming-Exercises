
public class RTOI {

	public int romanToInt(String s)
	{
		char [] c = s.toCharArray();
		int max = 0;
		int sum = 0;
		int prev =0;
		for(int i=0;i<c.length;i++)
		{
			sum =sum+letterNumber(c[i]);
			if(prev<letterNumber(c[i]))
			{
				sum=sum-2*prev;
			}
			prev = letterNumber(c[i]);
		}
		return sum;
	}
	
	public int letterNumber(char c)
	{
		switch(c)
		{
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			default:
				return 0;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		RTOI s = new RTOI();
		
		String c = "XI";
		
		System.out.println(s.romanToInt(c));
			
	}

}

