package in.purabtech.h;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorServiceRunner {
    public static void main(String[] args) {
        //create the thread pool
        ExecutorService service =  Executors.newFixedThreadPool(10);

        //submit task to execution
        for (int i=0; i<10001;i++) {
            service.execute(new Task());
        }
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Name:"+Thread.currentThread().getName());
    }
}
