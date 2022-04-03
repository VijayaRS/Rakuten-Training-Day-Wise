// Like HashSet, TreeSet also contains unique elements. 
//However, the access and retrieval time of TreeSet is quite fast. 
//The elements in TreeSet stored in ascending order.

package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
		set.add("piya");  
		set.add("anni");  
		set.add("piya");  
		set.add("chiu");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
