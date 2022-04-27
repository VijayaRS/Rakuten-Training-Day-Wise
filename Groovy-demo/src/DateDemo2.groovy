class DateDemo2 {
	static void main(String[] args) {
		Date olddate = new Date("08/07/1998");
		Date newdate = new Date("08/07/1998");
		Date latestdate = new Date();
		  
		println(olddate.getTime());
		println(newdate.getTime());
		println(latestdate.getTime());
		
		olddate.setTime(10000);
		newdate.setTime(10000);
		latestdate.setTime(10000);
		  
		println(olddate.toString());
		println(newdate.toString());
		println(latestdate.toString());
	 }
}
