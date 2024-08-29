package mypogramsbasic;

public class MyTest {

	public static void main(String[] args) {
		System.out.println(reverse("avinash kumar singh"));

	}

	public static String reverse(String s) {

		String rev = "";

		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {

			rev = rev + ch[i];
		}
		StringBuffer sb = null;

		String[] st = s.split(" ");

		int[] a = new int[st.length];
		int i = 0;
		for (String sc : st) {

			a[i] = sc.length();
			i++;
		}

		String newrev = rev.replaceAll(" ", "");

		sb = new StringBuffer(newrev);

		sb.insert(a[0], ' ');
		sb.insert(a[0] + a[1] + 1, ' ');

		for (int c : a) {
			System.out.println(c);
		}
		return sb.toString();

	}

}
