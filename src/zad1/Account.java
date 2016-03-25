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
			System.out.println("Wprowadzono bÅ‚ednÄ… kwotÄ™.");
		} else {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		if (amount < 0)
			System.out.println("Wprowadzono bÅ‚ednÄ… kwotÄ™.");
		else if (amount > balance)
			System.out.println("Nie wystarczajÄ…ca iloÅ›Ä‡ Å›rodkÃ³w na koncie.");
		else
			balance -= amount;
	}

	public void transfer(Account acc, double amount) {
		if (balance < amount) {
			System.out.println("Nie wystarczajÄ…ca iloÅ›Ä‡ Å›rodkÃ³w na koncie.");
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

	public String toString() {
		return "Stan konta: " + getBalance();
	}
	
	public static void main(String[] args) {

/*		Account jan = new Account(500);
		Account ala = new Account(1500);
		jan.getBalance();
		jan.setBalance(500);
		
		
		 
		jan.transfer(ala, 3000);
		System.out.println(jan);
		System.out.println(ala);*/
	}

}
