package homework4;

public class CalculaterTax {
	public static int calculating(int income) {
		int tax = 0;
		
		if(income <= 150000) {
			tax = 0;
		}
		else if(income <= 300000) {
			tax = ((income-150000)/100)*5;
		}
		else if(income <= 500000) {
			tax = 7500+(((income-300000)/100)*10);
		}
		else if(income <= 750000) {
			tax = 7500+20000+(((income-500000)/100)*15);
		}
		else if(income <= 1000000) {
			tax = 7500+20000+37500+(((income-750000)/100)*20);
		}
		else if(income <= 2000000) {
			tax = 7500+20000+37500+50000+(((income-1750000)/100)*25);
		}
		else if(income <= 5000000) {
			tax = 7500+20000+37500+50000+250000+(((income-4750000)/100)*30);
		}
		else {
			tax = 7500+20000+37500+50000+250000+900000+(((income-4750000)/100)*35);
		}
	
		return tax;
	}
}
