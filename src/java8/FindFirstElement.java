package java8;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(1,3,5,56,34,23);
		 
		ls.stream().findFirst().ifPresent(System.out::println);
		
		
	}


}
