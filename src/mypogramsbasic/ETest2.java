package mypogramsbasic;

public class ETest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 5, 0, 8, 0, 7, 0 };

		int[] temp = new int[arr.length];

		int c = arr.length-1;
		int d = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				temp[d++] = arr[i];

			} else {

				temp[c] = arr[i];
				c--;
				
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(temp[i]);
		}

	}

}
