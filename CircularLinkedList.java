import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CircularLinkedList {
	
	public static void main(String args[])
	{
		int x = 0,y=0,m;
		List<Integer> a = new ArrayList<Integer>();
		a.add(25);
		a.add(30);
		a.add(35);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(35);
		a.add(75);
		a.add(90);
		
		Set<Integer> p = new HashSet<Integer>(a);
		
		if(p.size()<a.size())
		{
			System.out.println("There is a loop ");
		}
		else
		{
			System.out.println("There is no Loop");
		}
	}
		
		
}
