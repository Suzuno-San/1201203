package homework2;

public class CalculaterWaterBill {
	public static double calculating(int units) {
		double price = 0;
		if(units <= 10) {
			price = units*10.2;
		}
		else if(units > 10 && units <= 20){
			price = (10*10.2)+((units-10)*16);
		}
		else if(units > 20 && units <= 30) {
			price = (10*10.2)+(10*16)+((units-20)*19);
		}
		else {
			price = (10*10.2)+(10*16)+(10*19)+((units-30)*21.20);
		}
		return price;
	}
}
