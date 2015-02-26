import java.util.Stack;

/**
 * 
 * @author Sumanth
 * 
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if (s.isEmpty())
			return true;
		String t = s.replaceAll("[^a-zA-Z0-9]", "");
		if(t.length()==1)
			return false;
		Stack<Character> st = new Stack<Character>();
		int i;
		for (i = 0; i < t.length() / 2; i++) {
			st.push(t.charAt(i));
		}
		if (t.length() % 2 == 1)
			i++;
		while (i < t.length()) {
			Character c = st.pop();
			if (Character.toLowerCase(c) != Character.toLowerCase(t.charAt(i)))
				return false;
			i++;
		}
		return true;

	}

	public static void main(String[] args) {
		ValidPalindrome v = new ValidPalindrome();
		System.out.println(v.isPalindrome("A man, a plan, a canal: Panama"));
		

	}

}
