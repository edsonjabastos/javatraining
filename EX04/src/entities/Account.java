package entities;

public class Account {
	private int accountNumber;
	private String titularName;
	private double balance;

	public Account(int accountNumber, String titularName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.titularName = titularName;
		addBalance(initialDeposit);
	}

	public Account(int accountNumber, String titularName) {
		this.accountNumber = accountNumber;
		this.titularName = titularName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

//	public void setAccountNumber(int accountNumber) {
//		this.accountNumber = accountNumber;
//	}

	public String getTitularName() {
		return titularName;
	}

	public void setTitularName(String titularName) {
		this.titularName = titularName;
	}

	public double getBalance() {
		return balance;
	}

//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

	public void addBalance(double quantity) {
		this.balance += quantity;
	}

	public void removeBalance(double quantity) {
		this.balance -= quantity + 5;
	}

	public String toString() {
		return "Account data:\n" + "Account " + accountNumber + ", Holder: " + titularName + ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
