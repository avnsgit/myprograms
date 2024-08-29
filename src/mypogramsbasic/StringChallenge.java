package mypogramsbasic;

import java.util.HashMap;

public class StringChallenge {
    public static void main(String[] args) {
        // Test the function with example inputs
        System.out.println(StringChallenge("rkqodlw", "world")); // should return true
        System.out.println(StringChallenge("hello", "world"));   // should return false
    }

    public static String StringChallenge(String str1, String str2) {
        // __define-ocg__ Create a HashMap to count characters
        HashMap<Character, Integer> hm = new HashMap<>();

        // Count characters in str1
        for (char c : str1.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Check if str2 can be formed from str1
        for (char c : str2.toCharArray()) {
            if (!hm.containsKey(c) || hm.get(c) == 0) {
                return "false";
            }
            hm.put(c, hm.get(c) - 1);
        }

        return "true";
    }
}

