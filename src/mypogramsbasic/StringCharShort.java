package mypogramsbasic;
import java.util.Arrays;

public class StringCharShort {

	public static void main(String[] args) {
		String s = "avinash";
		char[] ch = s.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]> ch[j]) {
					temp = ch[i];
					ch[i]= ch[j];
					ch[j]= temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(ch));
	}
}
