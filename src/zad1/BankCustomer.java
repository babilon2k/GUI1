package zad1;

public class BankCustomer {

	private Person person;
	private Account account;

	public BankCustomer() {
	}

	public BankCustomer(Person person) {
		this.person = person;
		this.account = new Account(0.0);
	}
	
	public Account getAccount() {
		return account;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public String toString(){
		return "Klient: " +person.getName()+ " stan konta "+account.getBalance();
	}


}
