 package mypogramsbasic;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n= sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("Sum of Array is "+ sum);
	}

}
