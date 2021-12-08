
public class MultiThreadingRunnableExample implements Runnable {

	//there are two method to use java thread
		//1. extend Thread class and use run method
		//2. implement runnable interface..
		
		private int threadNumber;
		public MultiThreadingRunnableExample(int threadNumber) {
			this.threadNumber=threadNumber;
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println(i+" from thread "+ threadNumber);
				
				//if any thread got exception then other thread will continue running/execution
				if(threadNumber==3) { //this if condition for testing only
					throw new RuntimeException();
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {				
					e.printStackTrace();
				}
				
			}
		}

}
