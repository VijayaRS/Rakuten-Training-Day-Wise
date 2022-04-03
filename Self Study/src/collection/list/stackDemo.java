package collection.list;

import java.util.Iterator;
import java.util.Stack;

public class stackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
        stack.push("Piya");
        stack.push("chiuu");
        stack.push("anni");
        stack.push("Piya");
        Iterator <String> it=stack.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
	}

}
