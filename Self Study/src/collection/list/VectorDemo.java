//Vector uses a dynamic array to store the data elements. It is similar to ArrayList.  
//However, It is synchronized and contains many methods that are not the part of Collection framework.

package collection.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector=new Vector<String>();
		vector.add("piya");
		vector.add("anii");
		vector.add("chiuu");
		vector.add("piya");
		
		Iterator<String> itr=vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
