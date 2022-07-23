package homework2;

import java.util.Scanner;

public class WaterUserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Units: ");
		int userUnits = sc.nextInt();
		
		WaterUser user1 = new WaterUser(userUnits);
		user1.bill = CalculaterWaterBill.calculating(userUnits);
		System.out.println(user1.toString());
		
		sc.close();
	}
}
