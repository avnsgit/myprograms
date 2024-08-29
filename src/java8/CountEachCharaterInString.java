package java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharaterInString {

	public static void main(String[] args) {
		
		
		String s = "dfsfsdfdsfdsfsdf";
		
		
		Map<String,Long> hm = Arrays.stream(s.split(""))
				.map(s1 -> s1.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
				
		System.out.println(hm);
		
		
	}

}
