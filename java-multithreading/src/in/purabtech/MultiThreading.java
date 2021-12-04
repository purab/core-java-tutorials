package in.purabtech;

public class MultiThreading {
	public static void main(String[] args) {
		
		//With Thread class
		for (int i = 0; i < 5; i++) {
			//MultiThreadThings multiThreadThings = new MultiThreadThings(i);
			//multiThreadThings.start();
		}
		
		//with Runnable - it is good for extending or implementing multiple classes
		for (int i = 0; i < 5; i++) {
			MultiThreadRunnable multiThreadRunnable = new MultiThreadRunnable(i);
			Thread myThread = new Thread(multiThreadRunnable);
			myThread.start();
			myThread.isAlive();
		}		
	}

}
