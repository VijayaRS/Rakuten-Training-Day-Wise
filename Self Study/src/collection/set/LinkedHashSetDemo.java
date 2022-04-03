//Like HashSet, It also contains unique elements. 
//It maintains the insertion order and permits null elements.

package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("piya");  
		set.add("chiu");  
		set.add("piya");  
		set.add("anya");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
