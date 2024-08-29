package mypogramsbasic;

public class AdjasantSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "avinash";
		swap(s1);
	}

	
	public static void swap(String s)
	{
		StringBuffer sb = new StringBuffer();
		int l= s.length();
		if(l%2==0)
		{
			for(int i=0;i<l-1;i=i+2)
			{
				char a= s.charAt(i);
				char b= s.charAt(i+1);
				sb.append(b).append(a);
			}
			
			System.out.println(sb);
		}
		else
		{
			for(int i=0;i<l-1;i=i+2)
			{
				char a= s.charAt(i);
				char b= s.charAt(i+1);
				sb.append(b).append(a);
			}
			sb.append(s.charAt(l-1));
			System.out.println(sb);
		}
	}
}
