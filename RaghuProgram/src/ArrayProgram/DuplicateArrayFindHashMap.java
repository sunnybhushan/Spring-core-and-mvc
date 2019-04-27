package ArrayProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateArrayFindHashMap {
	public static void main(String[] args) {
		int ar[] = { 3, 5, 4, 2, 4, 4, 3 };

		Map<Integer, Integer> hm = new HashMap<>();
		for (int no : ar) {
			Integer count = hm.get(no);
			if (count == null) {
				hm.put(no, 1);
			} else {
				count = count + 1;
				hm.put(no, count);
			}
		}

		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for (Map.Entry<Integer, Integer> entry : es) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}

	}
}
