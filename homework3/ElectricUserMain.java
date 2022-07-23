package homework3;

import java.util.Scanner;

public class ElectricUserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input ID: ");
		long userId = sc.nextLong();
		System.out.print("Input Name: ");
		String userName = sc.next();
		System.out.print("Input Surname: ");
		String userSurname = sc.next();
		System.out.print("Input ElectricUnits: ");
		int userUnits = sc.nextInt();
		
		ElectricUser user1 = new ElectricUser(userId,userName,userSurname,userUnits);
		user1.bill = CalculaterEectricBill.calculating(userUnits);
		System.out.println(user1.toString());
		
		sc.close();
	}
}
