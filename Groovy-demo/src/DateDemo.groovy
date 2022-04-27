//Date class have two constructors- Date() & Date(long millisec)
class DateDemo {
	static void main(String[] args) {
		//Date date = new Date(100);
		
		// display time and date using toString()
		//System.out.println(date.toString());
		
		//after()
//		Date olddate = new Date("05/11/2015");
//		Date newdate = new Date("05/12/2015");
//		Date latestdate = new Date();
//		  
//		System.out.println(olddate.after(newdate));
//		System.out.println(latestdate.after(newdate));
//		
//		System.out.println(olddate.equals(newdate));
//		System.out.println(latestdate.equals(newdate));
		Date olddate = new Date("08/07/1998");
		Date newdate = new Date("08/07/1998");
		Date latestdate = new Date();
		  
		println(olddate.compareTo(newdate));
		println(latestdate.compareTo(newdate));
  
		println(olddate.toString());
		println(newdate.toString());
		println(latestdate.toString());
		
		println(olddate.before(newdate));
		println(olddate.before(latestdate));
	 
	 }
}


//Wed Apr 27 14:30:51 IST 2022
//Thu Jan 01 05:30:00 IST 1970