package mypogramsbasic;

public class HolowTriangle {

	public static void printPattern(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {

				if (k == 1 || k == (2 * i - 1) || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPattern(6);

	}

}
