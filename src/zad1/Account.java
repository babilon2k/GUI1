package zad1;

public class Account {

	private double balance;
	private static double intrestRate = 0.0;

	public Account() {
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Wprowadzono błędną kwotę");
		} else {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount < 0)
			System.out.println("Wprowadzono błędną kwotę");
		else if (amount > balance)
			System.out.println("Nie wystarczająca ilość środków na koncie");
		else
			balance -= amount;
	}

	public void transfer(Account acc, double amount) {
		if (balance < amount) {
			System.out.println("Nie wystarczająca ilość środków na koncie");
		} else {
			this.withdraw(amount);
			acc.deposit(amount);
		}
	}

	public static void setInterestRate(double rate) {
		intrestRate = rate;
	}

	public void addInterest() {
		this.balance = balance * (1 + intrestRate / 100);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}
