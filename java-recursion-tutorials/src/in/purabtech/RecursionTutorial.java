package in.purabtech;

public class RecursionTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHi(3);		
	}
	
	public static void sayHi(int count) {
		System.out.println("Hello HI...");
		
		//added exit strategy for recursive call of method..
		if(count <=1) {
			return;
		}
		sayHi(count-1);
	}

}
