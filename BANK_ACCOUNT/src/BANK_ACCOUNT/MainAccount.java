package BANK_ACCOUNT;

public class MainAccount {//exercise on YouTube

public static void main(String[] args) {
		
		MainAccount a = new MainAccount("A", 15);
		
		Runnable task1 = new MyWithdraw(a);
		Thread thread1 = new Thread(task1);
		
		Runnable task2 = new MyWithdraw(a);
		Thread thread2 = new Thread(task2);

		thread1.start();
		thread2.start();
	}
}
