package zad3;

public class ReversibleString implements Reversible {
	
	public String name;
	
	public ReversibleString(String name){
		this.name=name;
	}

	@Override
	public void reverse() {
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
		
	}

}
