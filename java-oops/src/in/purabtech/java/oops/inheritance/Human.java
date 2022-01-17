package in.purabtech.java.oops.inheritance;

public abstract class Human { //super class
	private String name;
	private int age;
	
	public abstract void write();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
