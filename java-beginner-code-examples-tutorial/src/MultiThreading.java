
public class MultiThreading {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			//Using Thread class
			//MultiThreadingExample myThread = new MultiThreadingExample(i);
			//myThread.start();
			
			//using Runnable interface
			//java does not allow multiple inheritance so instead of extending Thread use Runnable interface
			MultiThreadingRunnableExample myRThread= new MultiThreadingRunnableExample(i);
			Thread myThread=new Thread(myRThread);
			myThread.start();
			
			//check thread is working/live or not
			System.out.println(myThread.isAlive()); 
			
			
		}
		
		
		/*
		 * MultiThreadingExample myThread2 = new MultiThreadingExample();
		 * 
		 * myThread2.start();
		 */
	}

}
