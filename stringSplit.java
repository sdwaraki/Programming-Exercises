
public class stringSplit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "the sky is blue";
		String [] splitString = s.split(" ");
		for(int i=splitString.length-1;i>=0;i--)
			System.out.print(splitString[i]+" ");
		
		
	}

}
