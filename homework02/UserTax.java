package homework02;

public class UserTax {
	int income;
	int tax;
	
	public UserTax(int income) {
		this.income = income;
		this.tax = 0;
	}
	
	public String toString() {
		return "User income "+this.income+" Baht, User tax is "+this.tax+" Baht";
	}
}
