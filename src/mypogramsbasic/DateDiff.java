package mypogramsbasic;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateDiff {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String s1="12/03/2012";
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy");
		Date d1= new Date();
		String s2=sdf1.format(d1);
		//String s2="14/03/2012";
		System.out.println(s2);
		int n= dateDifference(s1,s2);
		System.out.println(n);
	}
	
	public static int dateDifference(String s1, String s2) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1= sdf.parse(s1);
		Date d2= sdf.parse(s2);
		Calendar cd= Calendar.getInstance();
		cd.setTime(d1);
		long n1 = cd.getTimeInMillis();
		cd.setTime(d2);
		long n2= cd.getTimeInMillis();
		int n= Math.abs((int)((n1-n2)/(1000*3600*24)));
		return n;
		
	}
	

}
