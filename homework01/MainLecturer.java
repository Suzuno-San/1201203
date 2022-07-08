package homework01;

public class MainLecturer {
	public static void main(String[] args) {
		
		int myID = 1;
		String myName = "Chattrakul";
		String mySurname = "Sombattheera";
		
		Lecturer obj = new Lecturer(myID, myName, mySurname);
		
		String myLecturer = obj.toString();
		
		System.out.println("obj: "+myLecturer);
	}
}
