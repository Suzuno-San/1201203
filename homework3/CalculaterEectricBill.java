package homework3;

public class CalculaterEectricBill {
	public static double calculating(int units) {
		double bill = 0;
		if(units <= 15) {	// 15 หน่วยแรก
			bill = units*2.3488;
		}
		else if(units <= 25) {
			bill = (15*2.3488)+((units-15)*2.9882);
		}
		else if(units <= 35) {
			bill = (15*2.3488)+(10*2.9882)+((units-25)*3.2405);
		}
		else if(units <= 100) {
			bill = (15*2.3488)+(10*2.9882)+(10*3.2405)+((units-35)*3.6237);
		}
		else if(units <= 150) {
			bill = (15*2.3488)+(10*2.9882)+(10*3.2405)+(65*3.6237)+((units-100)*3.7171);
		}
		else if(units <= 400) {
			bill = (15*2.3488)+(10*2.9882)+(10*3.2405)+(65*3.6237)+(50*3.7171)+((units-150)*4.2218);
		}
		else {
			bill = (15*2.3488)+(10*2.9882)+(10*3.2405)+(65*3.6237)+(50*3.7171)+(250*4.2218)+((units-400)*4.4217);
		}
		return bill + 8.19;
	}
}
