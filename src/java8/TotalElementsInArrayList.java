package java8;

import java.util.Arrays;
import java.util.List;

public class TotalElementsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> ls = Arrays.asList(1,4,5,5,6);
		long l = ls.stream().count();
		
		System.out.println(l);

	}

}
