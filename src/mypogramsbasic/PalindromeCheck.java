package mypogramsbasic;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome");
		
		int number= sc.nextInt();
		int rem=0;
		int sum=0;
		int temp;
		temp= number;
		while(number!=0)
		{
			rem= number%10;
			sum= sum*10+ rem;
			number= number/10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("Number is Palindrome");
		}
		
		else {
			System.out.println("Number is not Palindrome");
		}
		System.out.println("Also revese of number is "+ sum);
	}

}
