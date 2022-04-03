//dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. 
//The elements stored in the ArrayList class can be randomly accessed. 


package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("chiu");
		list.add("Anni");
		list.add("chiu");
		//there are different ways which we can iterate through a list
		//1. for loop, while loop, for each loop
		//for(int i=0;i<list.size();i++) {
		//	System.out.println(list.get(i));
		//}
		//2. through iterator
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+ " ");
		}
		

	}

}
