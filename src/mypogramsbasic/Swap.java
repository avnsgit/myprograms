package mypogramsbasic;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number a");
		int a= sc.nextInt();
		System.out.println("Enter the second number b");
		int b= sc.nextInt();
	/*	int c;
		c=a;
		a=b;
		b=c;*/
		
// swap without third variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("value of a is "+ a);
		System.out.println("value of b is "+ b);
	}

}
