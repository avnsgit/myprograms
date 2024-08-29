package java8;

public class ReverseStringWithSpacepreserve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Welcome to java";

		char[] input1 = input.toCharArray();

		char[] output = new char[input1.length];

		for (int i = 0; i < input1.length; i++) {

			if (input1[i] == ' ') {
				output[i] = ' ';

			}
		}
		int j = output.length - 1;

		for (int i = 0; i < input1.length; i++) {

			if (input1[i] != ' ') {

				if (output[j] == ' ') {

					j--;
				}

				output[j] = input1[i];
				j--;

			}

		}
		System.out.println(String.valueOf(output));
	}

}
