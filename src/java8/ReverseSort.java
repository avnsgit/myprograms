package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		myList.stream().sorted(Collections.reverseOrder()).forEach(System.out :: println);
		

	}

}
