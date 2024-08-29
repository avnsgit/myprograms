package mypogramsbasic;
import java.util.HashMap;
import java.util.Map;

public class Test {
	    public static void main(String args[]) {
	      String s = "Avinash Kumar Singh";
	      char[] ch = s.toCharArray();
	      
	      HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	      
	      for(char c : ch){
	          
	          if(hm.containsKey(c)){
	              
	              hm.put(c, hm.get(c)+1);
	          }
	          else
	          {
	              
	              hm.put(c,1);
	          }
	          
	      }
	        for(Map.Entry<Character,Integer> m : hm.entrySet())
	        
	        System.out.println(m.getKey() + " "+ m.getValue());
	    }
	}
