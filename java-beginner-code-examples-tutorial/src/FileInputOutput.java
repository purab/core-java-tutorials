import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class FileInputOutput {
	
	static String[] names= {"purab","sivan","neha","san"};

	public static void main(String[] args) {
		//write to file- if not then create it
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("writing to file...");
			writer.write("\nwriting second line...");
			
			for(String name : names) {
				writer.write("\n"+name);				
			}
			
			writer.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		////read from file
		try {
			BufferedReader reader=new BufferedReader(new FileReader("output.txt"));
			String lineString;
			while ((lineString = reader.readLine()) !=null) {
				System.out.println(lineString);
			}
			
			reader.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
