package mypogramsbasic;
public class StringReverse {

	public static void main(String[] args) {

		String s = "Welcome to java";
		String[] sa = s.split(" ");
		String revString = "";
		for (String sb : sa) {
			StringBuilder sbl = new StringBuilder(sb);
			sbl.reverse();
			revString = revString + " " + sbl.toString();
		}
		System.out.println(revString);
	}
}
