package in.purabtech;

public class MultiThreadThings extends Thread {
	
	private int threadNumber; 
	
	public MultiThreadThings(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println(i +" from ThreadNumber: "+ threadNumber);
			
			//if any thread had exception then other thread will work as it is
//			if(threadNumber== 3) {
//				throw new RuntimeException();
//			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	
}
