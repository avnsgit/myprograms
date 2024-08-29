package mypogramsbasic;

import java.util.Scanner;

public class Armostrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for check armostrong number");
		int num= sc.nextInt();
		int r=0;
		int sum=0;
		int temp;
		temp= num;
		while(num!=0)
		{
			r= num%10;
			sum=sum+r*r*r;
			num= num/10;
			
		}
		
		if(sum==temp)
		{
			System.out.println("Number is Armostrong number");
		}
		else
		{
			System.out.println("number is not Armostrong number");
		}
	}

}
