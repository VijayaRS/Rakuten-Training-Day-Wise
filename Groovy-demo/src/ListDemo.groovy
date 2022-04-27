//Append the new value to the end of this List
class ListDemo {
	static void main(String[] args) {
		def lst = [11, 12, 13, 14];
		  
		println(lst);
		lst.add(15);
		  
		println(lst);
		lst.add(2,20);
		  
		println(lst);
		
		println(lst.contains(12));
		println(lst.get(2));
		println(lst.isEmpty());
		
		def lst2 = [11, 12, 13, 14];
		def newlst = [];
		
		newlst = lst2.minus([12,13]);
		println(newlst);
		newlst = lst.plus([15,16]);
		println(newlst);
		
		println(newlst.pop());
		println(newlst);
		
		println(newlst.remove(2));
		println(newlst);
		
		println(lst.size());
		
	 }
}
