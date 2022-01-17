package in.purabtech.java.oops.inheritance;

public class School {

	public static void main(String[] args) {
		
		Student student = new Student();		
		student.setRollNo(4);
		student.setsName("purab");
		student.setMarks(40);
		student.setsAge(30);		
		
		double percent = student.getPercent();
		System.out.println(percent);
		
		Teacher teacher = new Teacher();
		teacher.seteId(1);
		teacher.settName("test");
		teacher.settAge(30);
		teacher.setSalary(30000);
		
		int asalary= teacher.annualSalary();
		System.out.println(asalary);
		
		
		

	}

}
