package zad2;

public abstract class Pacjent {

	private String nazwisko;
	
	public Pacjent(String n) {
		this.nazwisko = n;
	}
	
	public String nazwisko(){
		return nazwisko;
	}

	public abstract String leczenie();

	public abstract String choroba();
}
