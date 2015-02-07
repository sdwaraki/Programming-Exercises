import java.util.ArrayList;
import java.util.List;

public class Anagrams {
	public String x;
	public static List<String> result = new ArrayList<String>();

	public List<String> anagrams(String[] strs) {
		if (strs.length == 0 || strs == null) {
			return null;
		}

		for (int i = 0; i < strs.length; i++) {
			helper("", strs[i]);
		}

		return result;
	}

	public void helper(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			result.add(prefix);

		for (int i = 0; i < n; i++) {
			helper(prefix + str.charAt(i),
					str.substring(0, i) + str.substring(i + 1, n));
		}

	}

	public static void main(String[] args) {
		Anagrams p = new Anagrams();
		String [] str = {"amy","joe","tom"};
		List<String> b = new ArrayList<String>();
		b = p.anagrams(str);
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
	}
}
