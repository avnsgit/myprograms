package mypogramsbasic;
public class ArraySortRev {

	public static void main(String[] args) {
		int[] a = { 30, 25, 75, 24, 89 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] < a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
