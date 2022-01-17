package in.purabtech.java.oops.inheritance;

public class School {

	public static void main(String[] args) {
		
		Student student = new Student();		
		student.setRollNo(4);
		student.setName("purab");
		student.setMarks(40);
		student.setAge(30);	
		student.write();
		
		double percent = student.getPercent();
		System.out.println(percent);
		
		Teacher teacher = new Teacher();
		teacher.seteId(1);
		teacher.setName("test");
		teacher.setAge(30);
		teacher.setSalary(30000);
		teacher.write();
		
		int asalary= teacher.annualSalary();
		System.out.println(asalary);
		
		
		

	}

}
