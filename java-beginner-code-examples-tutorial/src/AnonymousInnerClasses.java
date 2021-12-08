
public class AnonymousInnerClasses {

	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		myAnimal.makeNoise();
		
		//creating anonymous subclass
		Animal bigFoot =new Animal() {
			@Override
			public void makeNoise() {
				System.out.println("Grawlness...");				
			}
		};
		bigFoot.makeNoise();
		
		//Runnable class impmentation
		Runnable myAnonymousRunnable = new Runnable() {			
			@Override
			public void run() {				
				System.out.println("I am in Anonymous runnable...");
			}
		};
		myAnonymousRunnable.run();

	}

}
