import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnChecked {

	public static void main(String[] args) {	
		//checked exception
		readFile("myfile.txt");
		
		//unchecked exception
		//String name="purab";
		String name=null;
		printLength(name);
	}
	
	private static void printLength(String myString) {
		try {
			System.out.println(myString.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(myString.length());
		
	}
	
	private static void readFile(String fileName) {
		//checked exception
		try {
			FileReader reader=new FileReader(fileName);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			System.out.println("file does not exits!!");
		}
		
	}

}
