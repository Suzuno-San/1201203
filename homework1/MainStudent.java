package homework1;

import java.util.Scanner;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input ID: ");
		long myId = sc.nextLong();
		System.out.print("Input Name: ");
		String myName = sc.next();
		System.out.print("Input Surname: ");
		String mySurname = sc.next();
		System.out.print("Input Mark: ");
		int myMark = sc.nextInt();
		
		Student std = new Student(myId,myName,mySurname,myMark);
		std.grade = Grade.grading(myMark);
		System.out.println(std.toString());
		
		sc.close();
	}
}
