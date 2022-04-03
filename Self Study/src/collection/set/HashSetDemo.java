//It represents the collection that uses a hash table for storage.
//Hashing is used to store the elements in the HashSet. It contains unique items.
//It removes the duplicates

package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();  
		set.add("piya");  
		set.add("chiu");  
		set.add("piya");  
		set.add("Anni");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
