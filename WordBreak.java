import java.util.HashSet;
import java.util.Set;

public class WordBreak {

	public static boolean wordBreak(String s, Set<String> dict) {
		String a;
		String b;
		for (int i = 1; i <=s.length(); i++) {
			a = s.substring(0, i);
			b = s.substring(i, s.length());
			if(i==s.length())
			{
				if(dict.contains(a))
					return true;
			}
			
			if (dict.contains(a))
			{
				boolean q = wordBreak(b,dict);
				if(q)
					return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		WordBreak w = new WordBreak();
		Set<String> dict = new HashSet<String>();
		dict.add("aaaa");
		dict.add("aa");
		/*dict.add("Code");
		dict.add("CodeLeet");
		dict.add("Coding");
		dict.add("Pop");
		dict.add("eye");*/
		String a = "aaaaaaa";
		boolean x = w.wordBreak(a, dict);
		System.out.println(x);
	}
}
