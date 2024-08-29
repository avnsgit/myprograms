package mypogramsbasic;
public class StringReverseRecurssion {

	public static void main(String[] args) {
		String s = "avinash";
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s) {
		
		if(s.length()==0 || s==null )
			return s;
		else
			return reverseString(s.substring(1)) + s.charAt(0);
	}

}
