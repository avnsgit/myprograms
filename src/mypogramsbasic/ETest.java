package mypogramsbasic;

import java.util.List;

public class ETest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		a = a+b; //(30)
		b = a-b; //(10)
		a = a-b; //(20)
		
		System.out.println(a + " " + b);
		
		String s = "Avinash";
		String s1 = "Singh";
		
		s = s.concat(s1);
		s1 = s.substring(0,s.length() - s1.length());
		s = s.substring(s1.length());
		
		System.out.println(s + " " + s1);
		
		int[] ls = {3,1,0,5,1,0,2,0};
		
		int count =0;
		
		int[] c = new int[ls.length];

		for(int i=0; i<ls.length;i++) {
			
			if(ls[i] != 0) {
				
				c[count++]= ls[i];
			}
			
		}
		
		
		for(int i=0; i<c.length ; i++) {
			
			System.out.println(c[i]);
		}
		
		int[] d = {95,20,85,65,30,83,25};
		
		for(int i=0; i<d.length;i++) {
			
			boolean isLeader = true;
			
			for(int j=i+1; j<d.length;j++) {
				
				if(d[i]< d[j]) {
					
					isLeader = false;
					
					break;
				}
				
			}
			
			if(isLeader) {
				
				System.out.println(d[i]);
			}
		}
		
		

	}

}
