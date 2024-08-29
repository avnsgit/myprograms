package mypogramsbasic;

import java.util.Scanner;

public class PrimenumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime number");
		int number = sc.nextInt();
		int counter=0;
		for (int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				counter++;
			}
		}
		
		if(counter==2)
		{
			System.out.println("number is prime number");
		}
		else
		{
			System.out.println("numer is not prime number");
		}
		

	}

}
