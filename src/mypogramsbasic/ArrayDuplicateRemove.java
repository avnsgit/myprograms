package mypogramsbasic;

import java.util.Arrays;

public class ArrayDuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 4, 2, 5, 5, 6, 8, 4 };

		Arrays.sort(a);

		int c = 0;

		int[] temp = new int[a.length];

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {

				temp[c++] = a[i];

			}
		}

		temp[c++] = a[a.length - 1];

		for (int i = 0; i < c; i++) {

			System.out.println(temp[i]);
		}

	}

}
