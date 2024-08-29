package mypogramsbasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Desperation";

		String s2="A Rope Ends It";
		anangramCheck(s1,s2);
	}
	
	public static void anangramCheck(String s1, String s2)
	{
		List<Character> l1= new ArrayList<>();
		List<Character> l2= new ArrayList<>();
		List<Character> l3= new ArrayList<>();
		
		String s3= s1.toUpperCase();
		String s4 = s2.toUpperCase();
		for(int i=0; i<s3.length();i++)
		{
			l1.add(s3.charAt(i));
			
		}
		
		for(int i=0; i<s4.length();i++)
		{
			l2.add(s4.charAt(i));
			
		}
		
		l3.add(' ');
		l1.removeAll(l3);
		l2.removeAll(l3);
		Collections.sort(l1);
		Collections.sort(l2);
		
		
		
		System.out.println(" first Sring = "+l1 );
		System.out.println(" second Sring = "+l2 );
		if(l1.equals(l2))

			System.out.println("true");

		else

			System.out.println("false");


		
	}

}
