//In LinkedList, the manipulation is fast because no shifting is required.

package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



public class linkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ld=new LinkedList <String>();
		ld.add("chiu");
		ld.add("Anni");
		ld.add("chiu");
		
		Iterator<String> it=ld.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
