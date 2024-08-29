package java8;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of Array");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the Element of Array");

		for (int i = 0; i < n; i++) {

			a[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {

			sum += a[i];
		}

		System.out.println("Sum of Elemets of Array is :" + sum);
		sc.close();
	}

}
