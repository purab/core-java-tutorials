package in.purabtech.java.oops.inheritance;

public class Student {
	int rollNo;
	String sName;
	int sAge;
	int marks;
	
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
