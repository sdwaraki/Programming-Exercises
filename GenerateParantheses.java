
public class GenerateParantheses {

	public void generateParanthesis(int open, int close, String s)
	{
		if(open==0 && close==0)
			System.out.println(s);
		
		if(open>0)
			generateParanthesis(open-1, close+1, s+"(");
		
		if(close>0)
			generateParanthesis(open, close-1, s+")");
	}
	
	
	public static void main(String[] args) {
		
		GenerateParantheses g = new GenerateParantheses();
		g.generateParanthesis(3, 0, "");
		
	}

}
