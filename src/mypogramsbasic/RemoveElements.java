package mypogramsbasic;
public class RemoveElements {

	public static void main(String[] args) {
		String s = "ab5c2d4ef12s";
		
		String s1= s.replaceAll("[^14]", "");
		
		System.out.println(s1);
		
	}

}
