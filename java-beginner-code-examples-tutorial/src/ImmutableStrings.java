
public class ImmutableStrings {

	public static void main(String[] args) {
		//name and secondName string variable pointing same memory
		String name="purab";
		String secondName="purab";
		System.out.println(name==secondName);//result true
		
		//name and thirdName string variable are not pointing same memory
		String thirdName=new String("purab");
		System.out.println(name==thirdName); //result false

	}

}
