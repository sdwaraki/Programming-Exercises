import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {

	public List<List<Integer>> getSubsets(int a[], int index) {
		List<List<Integer>> allSubsets;
		if (index == a.length) {
			allSubsets = new ArrayList<List<Integer>>();
			allSubsets.add(new ArrayList<Integer>());
		} else {
			allSubsets = getSubsets(a, index+1);
			int item = a[index];
			List<List<Integer>> moresubsets = new ArrayList<List<Integer>>();
			for (List<Integer> subset : allSubsets) {
				List<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allSubsets.addAll(moresubsets);
		}
		return allSubsets;
	}

	public static void main(String[] args) {

		GenerateSubsets g = new GenerateSubsets();
		int a[] = { 4,1,0};
		List<List<Integer>> result;
		result = g.getSubsets(a, 0);
		for (List<Integer> l : result) {
			if (l.size()>0) {
				for (int i = 0; i < l.size(); i++) {
					System.out.print(l.get(i) + " ");
				}
				System.out.println("\n");
			} else {
				System.out.println("N");
			}
		}

	}

}
