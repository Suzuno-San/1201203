package homework2;

public class WaterUser {
	int units;
	double bill;
	
	public WaterUser(int unit){
		this.units = unit;
		this.bill = 0;
	}
	
	public String toString() {
		return "User used water "+this.units+" Units, Water bill is "+this.bill+" Baht";
	}
}
