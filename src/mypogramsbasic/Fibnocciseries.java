package mypogramsbasic;

import java.util.Scanner;

public class Fibnocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of fibnocci series");
		int length = sc.nextInt();
		int a=0,b=1,c;
	//	System.out.print(a+" "+b);
		for(int i=0;i<length;i++)
		{
			System.out.print(a + " ");

			c=a+b;
			a=b;
			b=c;
		}
		

	}

}
