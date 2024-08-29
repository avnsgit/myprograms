package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = Arrays.asList(1,3,2,1,3,5);
		Set<Integer> set = new HashSet<>();
		 
		ls.stream().filter(n -> !set.add(n)).forEach(System.out:: println); // duplicate elements
		
	//	ls.stream().filter(n -> set.add(n)).forEach(System.out:: println);
		
		
		String s = "avinashff";
		Set<String> set1 = new HashSet<>();
		
		Arrays.stream(s.split("")).map(n -> n.toLowerCase()).filter(n -> set1.add(n)).forEach(System.out::println);
	}

}
