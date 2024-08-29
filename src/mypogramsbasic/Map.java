package mypogramsbasic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String>hm= new HashMap<Integer,String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of HashMap");
		int l = sc.nextInt();
		System.out.println("Enter the values of HashMap");
		for(int i=0;i<l;i++)
		{
			hm.put(sc.nextInt(),sc.next());
		}
		
		getValues(hm);
	}
	
	public static void getValues(HashMap<Integer,String> hm)
	{
		int count=0;
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			int n = itr.next();
			if(n%4!=0)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
