
class ObjectODemo {
	private int StudentID;
	private String StudentName;
	 
	void setStudentID(int pID) {
	   StudentID = pID;
	}
	 
	void setStudentName(String pName) {
	   StudentName = pName;
	}
	 
	int getStudentID() {
	   return this.StudentID;
	}
	 
	String getStudentName() {
	   return this.StudentName;
	}
	 
	static void main(String[] args) {
	   ObjectODemo od = new ObjectODemo();
	   od.setStudentID(27);
	   od.setStudentName("piya");
		 
	   println(od.getStudentID());
	   println(od.getStudentName());
	}
 
	
}
