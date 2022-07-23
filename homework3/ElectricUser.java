package homework3;

public class ElectricUser {
	long id;
	String name;
	String surname;
	int units;
	double bill;
	
	public ElectricUser(long id, String name, String surname, int electricUnits) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.units = electricUnits;
		this.bill = 0;
	}
	
	public String toString() {
		return "ID: "+this.id+", Name: "+this.name+", Surname: "+this.surname+
				" used electric "+this.units+" Units, ElectricBill is "+this.bill+" Baht";
	}
}
