//In Deque, we can remove and add the elements from both the side.

package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	public static void main(String[] args) {  
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("piya");  
		deque.add("chiuu");  
		deque.add("anii");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}  
		}  
		 

}
