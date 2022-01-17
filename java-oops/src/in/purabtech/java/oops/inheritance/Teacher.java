package in.purabtech.java.oops.inheritance;

public class Teacher {
	//teachers and
	int eId;
	String tName;
	int tAge;
	int salary;
	
	
	
	public int geteId() {
		return eId;
	}



	public void seteId(int eId) {
		this.eId = eId;
	}



	public String gettName() {
		return tName;
	}



	public void settName(String tName) {
		this.tName = tName;
	}



	public int gettAge() {
		return tAge;
	}



	public void settAge(int tAge) {
		this.tAge = tAge;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public int annualSalary() {
		return salary*12;
	}
}
