import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
	
	public static void main(String[] args) {
		//we need to specify size of array for array object
		//in java array will have fixed size of array
		//array can hold anything (primitive or non primitive data types)
		String[] friendsArray= new String[4];	
		String[] friendsArray2= {"purab","manoj","atul","manmohan"};		
		System.out.println("Array result: "+friendsArray2[1]);
		System.out.println("Array size: "+friendsArray2.length);
		//You cannot add element to array
		//change element in array
		friendsArray2[0] ="New value";
		System.out.println("Array result: "+friendsArray2[0]);
		//we cannot remove element from array as it is fixed
		
		
		//we do not need to specify size of array in arraylist
		//arraylist can hold only objects
		ArrayList<String> friendsArrayList = new ArrayList<>();
		//this is mutable/changable arrarylist
		ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("purab","manoj","atul","manmohan"));
		System.out.println("ArrayList result: "+friendsArrayList2.get(1));
		System.out.println("ArrayList size: "+friendsArrayList2.size());
		//add element to arraylist
		friendsArrayList2.add("new element");
		System.out.println("ArrayList new elelment: "+friendsArrayList2.get(4));
		//change element value in arraylist
		friendsArrayList2.set(0, "new value");
		System.out.println("ArrayList 0: "+friendsArrayList2.get(0));
		//remove elelment from array lsit
		friendsArrayList2.remove(0);
		
		

	}

	
	
}
