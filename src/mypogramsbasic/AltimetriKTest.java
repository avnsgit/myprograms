package mypogramsbasic;

import java.util.HashMap;
import java.util.Map;

public class AltimetriKTest {

	public static void main(String[] args) {
		String str = "Avinash1231Kumar87Singh987";

		char[] ch = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();
		for (char c : ch) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {

				hm.put(c, 1);
			}

		}

		for (Map.Entry<Character, Integer> hp : hm.entrySet())

			System.out.println(hp.getKey() + " " + hp.getValue());

		str = str.replaceAll("[^\\d]", " ");
		str = str.trim();
		str = str.replaceAll(" +", " ");
		String[] str1 = str.split(" ");

		for (String s : str1) {
			int i1 = Integer.parseInt(s);
			System.out.println(add(i1));
		}
	}

	public static int add(int num) {

		int sum = 0, r = 0;
		while (num != 0) {

			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}

		return sum;

	}

}
