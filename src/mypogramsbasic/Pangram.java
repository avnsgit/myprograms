package mypogramsbasic;
public class Pangram {
	
	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		
		System.out.println(pangramCheck(s.toLowerCase()));
		
		
	}
	
	public static boolean pangramCheck(String s) {
		if(s.length()<26)
			return false;
		else
			for(int i='a';i<'z';i++) {
				if(s.indexOf(i)<0)
					return false;
			}
		
		return true;
	}

}
