package mypogramsbasic;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the elements of Array");
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array input is: ");
		for (int b : a) {
			System.out.print(" " + b);
		}
		int n = a.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("\n Array after bubble sort is: ");

		for (int c : a) {
			System.out.print(" " + c);
		}
	}

}
