package Collection;

import java.util.*;  
public class Hashmap {
	public static void main(String args[]){  
		   HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(1,"india");   
		   map.put(2,"us");    
		   map.put(3,"ussr");   
		   map.put(4,"germany");   
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
		}  
}
