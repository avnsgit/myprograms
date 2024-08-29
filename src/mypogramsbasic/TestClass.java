package mypogramsbasic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {

	

		// CODE EXAMPLE VALID FOR COMPILING
	    //    String[] input = {"Sathish", "Soumil", "Amit", "Kishore", "Sathish"};
	        //Output 
	        // Sathish -2 


	    public static void main(String[] args) {
	        
	       String[] input = {"Sathish", "Soumil", "Amit", "Kishore", "Sathish"};
	       
	       List<String> s = Arrays.asList(input);
	       
	       
	     Map<String, Long> hm =  s.stream().filter(s1 -> s1.startsWith("S")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap :: new, Collectors.counting()));
	     
	     for(Map.Entry<String, Long> h : hm.entrySet()) {
	    	 
	    	 System.out.println(h.getKey() + " " + h.getValue());
	    	 
	     }
	        

	        
	        
	        
	        
	    }
	}

