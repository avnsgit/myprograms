package mypogramsbasic;
public class StringDuplicateRemove {

	public static void main(String[] args) {
		String s ="Welcome to java";
		StringBuilder sb = new StringBuilder();
		String[] sb1 = s.split(" ");
		for(int i=sb1.length-1;i>=0;i--) {
			sb.append(sb1[i]+" ");
		}
		
		System.out.println(sb.toString());
		
		
	}

}
