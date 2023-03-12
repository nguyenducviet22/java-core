package MULTITHREADING;

public class MyThread extends Thread {//way #1
	
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Thread #1: "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 is finished");
	}

}
