package mypogramsbasic;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VoterValidityCheck {
	
	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
	//	String s1= "01/02/1994";
		ageCheck(s1);
	}
	
	
	@SuppressWarnings("deprecation")
	public  static void ageCheck(String dob) throws ParseException
	{
		int year=0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dob1 = sdf.parse(dob);
		String now = "15/04/2019";
		Date current = sdf.parse(now);
		sdf.setLenient(false);
		int y= dob1.getYear();
		int y1= current.getYear();
		int m= dob1.getMonth();
		int m1= current.getMonth();
		int d= dob1.getDay();
		int d1 = current.getDay();
		year= y1-y;
		if(m>m1)
		{
			year--;
		}
		if(m==m1)
		{
			if(d>d1)
			{
				year--;
			}
		}
		
		if(year>=18)
		{
			System.out.println("You can vote. Your age is "+year);
		}
		else
		{
			System.out.println("You can not vote. Your age is "+year);
		}
	}

}
