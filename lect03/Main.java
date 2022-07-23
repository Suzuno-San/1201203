package lect03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Name: ");
		String myName = sc.next();
		System.out.print("Input Surname: ");
		String mySurname = sc.next();
		System.out.print("Input Mark: ");
		int myMark = sc.nextInt();
		
		Student std1 = new Student(myName,mySurname,myMark);
		std1.grade = Grade.grading(myMark);
		System.out.println(std1.toString());
		
	}
}
