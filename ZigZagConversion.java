import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sumanth
 * 
 */

public class ZigZagConversion {

	public String convertZigZag(String str, int nRows) {
		if (nRows == 1)
			return str;

		List<List<Character>> zigzag = new ArrayList<List<Character>>();
		int currentRow = -1;
		int direction = 1;
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < nRows; i++)
			zigzag.add(new ArrayList<Character>());

		for (int i = 0; i < str.length(); i++) {
			currentRow = currentRow + direction;
			if (currentRow == nRows) {
				direction = -1;
				currentRow = nRows - 2;
			}

			if (currentRow == -1) {
				direction = 1;
				currentRow = 1;
			}

			zigzag.get(currentRow).add(str.charAt(i));

		}

		for (int i = 0; i < zigzag.size(); i++)
			for (int j = 0; j < zigzag.get(i).size(); j++)
				s.append(zigzag.get(i).get(j));

		return s.toString();

	}

	public static void main(String args[]) {
		ZigZagConversion z = new ZigZagConversion();
		System.out.println(z.convertZigZag("IntroductiontoDataMining", 4));

	}

}
