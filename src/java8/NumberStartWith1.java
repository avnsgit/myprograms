package java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		List<Integer> ls = Arrays.asList(1,5,6,8,10,12);
		
		ls.stream().map(n -> String.valueOf(n)).filter(s -> s.startsWith("1")).forEach(System.out::println);
		
		
		
	}
}
