package BANK_ACCOUNT;

public class MyAccount {

	String name;
	double amount;
	
	public MyAccount(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	public void withdraw(double a) {
		if (this.getAmount()>= a) {
			Thread.sleep(1000);
			this.amount = this.amount - a;
			System.out.println(this.amount);
		} else {
			System.out.println("not enough money");
		}
	}
}
