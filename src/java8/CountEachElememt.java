package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachElememt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		
		Map<String,Long> mh = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mh);
		
		
		Map<String,Long> mh1 = names.stream().filter(x-> Collections.frequency(names,x)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mh1);
	}

}
