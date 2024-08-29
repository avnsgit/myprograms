package mypogramsbasic;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverse("avinash"));
	}

	public static String reverse(String s) {

		char[] srt = s.toCharArray();

		String rev = "";

		for (int i = srt.length - 1; i >= 0; i--) {

			rev = rev + srt[i];
		}

		return rev;

	}

}
