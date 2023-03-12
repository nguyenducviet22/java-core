package THREAT;

public class MyThread extends Thread {

	@Override
	public void run() {
		if (this.isDaemon()) {
			System.out.println("The daemon thread is running");
		} else {
			System.out.println("The user thread is running");
		}
		
	}
}
