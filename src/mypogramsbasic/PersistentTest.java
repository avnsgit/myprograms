package mypogramsbasic;
public class PersistentTest {

	public static void main(String[] args) {

		String s = "ab12@@@@@%44$12";

		String str = s.replaceAll("[^0-9]", " ");
		String str2 = str.replaceAll(" +", " ");
	
		

		String str1 = str2.trim();

		String[] strArr = str1.split(" ");
		int sum=0;

		for (String sb : strArr) {

				int a = Integer.parseInt(sb);
				
				sum = sum+ a;
			
		}
		
		System.out.println(sum);
	}

	public static int numberAdd(int num) {

		int temp = num;

		int sum = 0, r = 0;

		while (temp > 0) {

			r = temp % 10;
			sum = sum + r;
			temp = temp / 10;

		}

		return sum;
	}
	
	
	
	


}
