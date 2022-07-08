package homework01;

public class MainSubject {
	public static void main(String[] args) {
		
		int myID = 1201203;
		String myTitle = "ComputerProgramming";
		String myLecturer = "Chattrakul";
		
		Subject obj = new Subject(myID, myTitle, myLecturer);
		
		String mySubject = obj.toString();
		
		System.out.println("obj: "+mySubject);
	}
}
