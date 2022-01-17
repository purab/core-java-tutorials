package in.purabtech.java.oops.inheritance;

public class Student extends Human {
	
	/*
	 * Class 
	 * Object
	 * Encapsulation - data hiding
	 * Inheritance - parent child
	 * Polymorphism - many form- change behavior (over riding and over loading
	 * Abstraction - force to implement child method
	 * 
	 */
	
	int rollNo;
	
	int marks;
	
	
	
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	
	//method overriding
	public void write() {
		System.out.println("I am writing in student");
	}
	
	//Method over loading
	public void write(String assignment) {
		System.out.println("I am writing assignment:"+assignment);
	}	
}
