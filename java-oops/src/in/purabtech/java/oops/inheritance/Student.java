package in.purabtech.java.oops.inheritance;

public class Student {
	int rollNo;
	String sName;
	int sAge;
	int marks;
	
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int m) {
		if(m>=0)
			marks=m;
		else
			marks=0;
	}
	
	public double getPercent() {
		return (marks*1.0/75) *100;
	}
}
