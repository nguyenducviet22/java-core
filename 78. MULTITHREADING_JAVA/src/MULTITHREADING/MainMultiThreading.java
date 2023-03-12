package MULTITHREADING;

public class MainMultiThreading {

	public static void main(String[] args) throws InterruptedException {
		//way #1
		MyThread thread1 = new MyThread();
		//way #2
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		thread1.start();
//		thread1.join();//thread1 finished then thread 2
		thread2.start();
		
		//way num 1
//		Runnable muThread1 = new MyRunnable(50, "Viet");
//		Thread thread1 = new Thread(muThread1);
//		Runnable muThread2 = new MyRunnable(50, "Son");
//		Thread thread2 = new Thread(muThread2);
		
		//way num 2
//		Thread thread1 = new MyMultiThreading(50, "Viet");
//		Thread thread2 = new MyMultiThreading(50, "Son");

//		thread1.start();
//		thread2.start();
	}

}
