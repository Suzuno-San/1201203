package Test;

import java.util.Scanner;

public class MainStudent {
	
	public static char grading(int mark) {
		if(mark < 50) {
			return 'F';
		}
		else if(mark < 60) {
			return 'D';
		}
		else if(mark < 70) {
			return 'C';
		}
		else if(mark < 80) {
			return 'B';
		}
		else {
			return 'A';
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input ID: ");
		int myId = sc.nextInt();
		System.out.print("Input Name: ");
		String myName = sc.next();
		System.out.print("Input Surname: ");
		String mySurname = sc.next();
		System.out.print("Input Mark: ");
		int myMark = sc.nextInt();
		sc.close();
		
		//two Classes (grading in main class)
		Student obj1 = new Student(myId, myName, mySurname, myMark);
		obj1.grade = grading(myMark);
		System.out.println("studentmark(twoClass in main): "+obj1.toString());
		
		//two Classes (grading in data class)
		Student obj2 = new Student(myId, myName, mySurname, myMark);
		obj2.grade = obj2.grading(myMark);
		System.out.println("studentmark(twoClass in data): "+obj2.toString());
		
		//three Classes
		Student obj3 = new Student(myId, myName, mySurname, myMark);
		obj3.grade = Grader.grading(myMark);
		System.out.println("studentmark(ThreeClass): "+obj3.toString());
	}
}
