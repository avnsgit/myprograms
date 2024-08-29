package mypogramsbasic;

public class StringMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "@abc@1fhjh";
		validate(s);
		

	}
	
	public static void validate(String s)
	{
		//if(s.matches("[[a-zA-z]{1,} [0-9]{1,}[@#$]{1,}]{6,20}")) 
		if(s.matches("[[A-Za-z0-9 && ^[@#_]]{1} [@#_]{1,} [a-zA-Z]{1,} [A-Za-z0-9 && ^[@#_]]{1}]{8,}"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
