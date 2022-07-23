package homework02;

import java.util.Scanner;

public class UserTaxMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Income: ");
		int userIncome = sc.nextInt();
		
		UserTax user1 = new UserTax(userIncome);
		user1.tax = CalculaterTax.culculating(userIncome);
		System.out.println(user1.toString());
		
		sc.close();
	}
}
