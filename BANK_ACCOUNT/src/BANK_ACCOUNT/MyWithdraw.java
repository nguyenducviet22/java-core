package BANK_ACCOUNT;

public class MyWithdraw {

int acc;
	
	public MyWithdraw(int acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		this.acc.withdraw(10);
		
	}
}
