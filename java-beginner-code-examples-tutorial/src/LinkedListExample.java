import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		
		LinkedList<String> namesLinkedList = new LinkedList<>();
		//add
		//for add and remove element - it is faster in linkedlist over arraylist
		namesLinkedList.add("purab");
		namesLinkedList.add("manoj");
		namesLinkedList.add("atul");
		namesLinkedList.add("man");
		System.out.println(namesLinkedList.get(2));		
		namesLinkedList.add(1,"man2");
		
		ArrayList<String> namesArrayList = new ArrayList<>();
		//add
		namesArrayList.add("purab");
		namesArrayList.add("manoj");
		namesArrayList.add("atul");
		namesArrayList.add("man");
		System.out.println(namesArrayList.get(2));
		namesArrayList.add(1,"man2");
	}
}
