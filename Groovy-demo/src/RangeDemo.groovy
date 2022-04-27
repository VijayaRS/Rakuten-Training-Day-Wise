//Groovy -
//contains() Checks if a range contains a specific value.
//getFrom() returns the lower value of range
//getTo() returns the upper value of range
//subList() view of the portion of this Range

class RangeDemo {
	static void main(String[] args) {

		def rint = 1..10;
		for(int values: rint) {
			println(values);
		}

		println(rint.contains(2));
		println(rint.contains(11));
		println(rint.getFrom());
		println(rint.getTo());
		println(rint.isReverse());
		println(rint.size());
		println(rint.subList(1,4));
		println(rint.subList(4,8));
	}
}
