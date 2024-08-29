package java8;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurence {

	public static void main(String[] args) {

		String str = "Avinash548kumar554Singh54";

		char[] ch = str.toCharArray();

		Map<Character, Integer> hm = new HashMap<>();

		for (char c : ch) {

			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> m : hm.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

		}

		str = str.replaceAll("[^\\d]", " ").trim().replaceAll(" +", " ");

		String[] str1 = str.split(" ");

		for (String s : str1) {

			int i1 = Integer.parseInt(s);
			System.out.println(sum(i1));
		}

	}

	public static int sum(int n) {

		int sum = 0, r = 0;

		while (n != 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}

		return sum;

	}

}
