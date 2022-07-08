package week2;

public class MainStudent {
	public static void main(String[] args) {
		int myId = 123;
		String myName = "Natthapumin";
		String mySurname = "Manucham";
		int myMark = 80;
		
		Student obj1 = new Student(myId, myName, mySurname, myMark);
		obj1.grading();
		System.out.println("obj: "+obj1.toString());
		
		Student obj2 = new Student(456, "Supat", "nana", 70);
		obj2.grading();
		System.out.println("obj: "+obj2.toString());
	}
}
