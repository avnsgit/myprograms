package mypogramsbasic;

public class Nearelements {

	public static void main(String[] args) {

		int[] a = { 1, 3, 4, 3, 1, 2 };

		int target = 5;

		int[] temp = new int[2];

		int minDiff = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				int sum = a[i] + a[j];

				int diff = Math.abs(sum - target);

				if (diff < minDiff) {
					minDiff = diff;
					temp[0] = a[i];
					temp[1] = a[j];
				}

			}

		}
		
		System.out.println(temp[0] + " " + temp[1]);

	}

}
