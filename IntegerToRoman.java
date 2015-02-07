public class IntegerToRoman {

	public String IntegerToRoman(int num) {
		StringBuilder s = new StringBuilder();
		while (num > 0) {
			if (num >= 1000) {
				s.append("M");
				num = num - 1000;
				continue;
			}
			else if(num>=900)
			{
				s.append("DM");
				num = num-900;
				continue;
			}
			else if(num>=500)
			{
				s.append("D");
				num-=500;
				continue;
			}
			else if(num>=400)
			{
				s.append("CD");
				num-=400;
				continue;
			}
			else if(num>=100)
			{
				s.append("C");
				num-=100;
				continue;
			}
			else if(num>=50)
			{
				s.append("LC");
				num-=50;
				continue;
			}
			else if(num>=10)
			{
				s.append("X");
				num-=10;
				continue;
			}
			else if(num>=9)
			{
				s.append("IX");
				num-=9;
				continue;
			}
			else if(num>=5)
			{
				s.append("V");
				num-=5;
				continue;
			}
			else if(num>=4)
			{
				s.append("IV");
				num-=4;
				continue;
			}
			else
			{
				s.append("I");
				num-=1;
				continue;
			}
			
		}
		
		return s.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntegerToRoman i = new IntegerToRoman();
		System.out.println(i.IntegerToRoman(2390));
		

	}

}
