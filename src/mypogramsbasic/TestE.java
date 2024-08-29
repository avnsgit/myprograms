package mypogramsbasic;

public class TestE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -1, 0, 1, 2, -1, -4 };

		int sum = 0;

		for (int i = 0; i < nums.length - 2; i++) {

			for (int j = i + 1; j < nums.length - 1; j++) {
				{

					for (int k = j + 1; k < nums.length; k++) {

						sum = nums[i] + nums[j] + nums[k];

						if (sum == 0) {

							System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
						}
					}
				}

			}

		}

	}

}
