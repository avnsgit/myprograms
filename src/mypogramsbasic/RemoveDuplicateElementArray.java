package mypogramsbasic;
import java.util.Arrays;

// Java Program to Remove Duplicate Elements 
// From the Array using extra space 

public class RemoveDuplicateElementArray {

	public static void main(String[] args) {
		int a[] = {20,10,10,20,20};
		Arrays.sort(a);
		int n = a.length;
		int temp[] = new int[n];
		int j=0;
		for(int i=0; i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j++]= a[n-1];
		
		// Printing The array elements
		for (int i = 0; i < j; i++)
			System.out.print(temp[i] + " ");
	}
}
