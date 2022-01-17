package in.purabtech.java.oops.inheritance;

//Textual representation of object how Product will look like in the memory
class Product{
	//Attributes
	int pid;
	String name;
	int price;
	
	//Constructor
	Product() {
		System.out.println(">> Product Object constructed..");
	}
	
	//Methods (Behaviour)
	//to write data in Product we have this method
	void setProductDetails(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;		
	}
	
	//read data from product object
	void showProductDetails() {
		System.out.println(">> Product ID:"+pid+"-----");
		
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		
		System.out.println("--------------------------------");
	}
	
	
}

public class InheritanceApp {

	public static void main(String[] args) {
		

	}

}
