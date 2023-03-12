package MULTITHREADING;

public class MyRunnable implements Runnable {// way #2
//	int times;
//	String name;
//	
//	MyRunnable(int times, String name){
//		this.times = times;
//		this.name = name;
//		
//	}
//
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("Thread #2: " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #2 is finished");
	}
}
