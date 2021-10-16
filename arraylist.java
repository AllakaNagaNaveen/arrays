package Collection;
import java.util.*;  
public class Arraylist {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("hema");		
    list.add("hemu");  
		list.add("hemika");  
		list.add("hameer");  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
}
}
