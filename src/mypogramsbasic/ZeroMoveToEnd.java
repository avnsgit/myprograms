package mypogramsbasic;
public class ZeroMoveToEnd {

	public static void main(String[] args) {
		int[] a = {1,0,1,0,1,0,1,1,0,0};
		int count =0;
		
		
		for(int i=0; i<a.length;i++) {
			if(a[i]==1)
				count++;
		}
		
		for(int i=0; i<count ;i++) {
			a[i]= 1;
		}
		
		for(int i=count; i<a.length ;i++) {
			a[i]= 0;
		}
		
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]); 
		}
		
		

	}

}
