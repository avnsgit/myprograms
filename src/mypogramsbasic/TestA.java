package mypogramsbasic;

public class TestA {

	/*
	 * Longest Common Prefix in a string array i/P: ["jar", "jam", "java"] o/p: ja
	 */

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "-1"; // If the array is empty
		}

		// Find the shortest string in the array
		String shortest = strs[0];
		for (String str : strs) {
			if (str.length() < shortest.length()) {
				shortest = str;
			}
		}

		// Compare each character of the shortest string with other strings
		for (int i = 0; i < shortest.length(); i++) {
			char currentChar = shortest.charAt(i);
			for (String str : strs) {
				if (str.charAt(i) != currentChar) {
					return shortest.substring(0, i); // Return the common prefix
				}
			}
		}

		return shortest; // The entire shortest string is the common prefix
	}

	public static void main(String[] args) {
		String[] strs = { "geeksforgeeks", "geeks", "geek", "geezer" };
		System.out.println("The longest common prefix is: " + longestCommonPrefix(strs));
	}
}
