package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseString {
	
	
	public static void main(String[] Strings) {
		
		List<String> ls = Arrays.asList("abb","ccc","ddd");
		
		ls.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()).forEach(System.out :: println);
 		
		
		
	}

}
