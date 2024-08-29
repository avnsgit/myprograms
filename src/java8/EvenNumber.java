package java8;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		List<Integer> ls = Arrays.asList(1,5,6,8,10,12);
		
		ls.stream().filter(n -> n%2==0).forEach(s-> System.out.println(s));
		
		
		
	}
}
