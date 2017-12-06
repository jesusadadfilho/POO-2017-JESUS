package Model;

public class NumberUtils {
	private int num;
	
	public NumberUtils(int n) {
		this.num = n;
		
	}
	
	public boolean isPair() {
		if(this.num % 2 == 0) {
			return true;
		}
		return false;
	}
	public boolean isOddr() {
		if(this.num % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public String printCount() {
		String s = " ";
		for (int i = 0; i < this.num; i++) {
			s += i+", ";
		}
		return s;
	}
	
	public String printReverseCount() {
		String s = " ";
		for (int i = this.num; i > 0; i++) {
			s += i+", ";
		}
		return s;
	}
	

}
