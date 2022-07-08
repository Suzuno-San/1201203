package homework01;

public class MainClassRoom {
	public static void main(String[] args) {
		
		String myID = "IT405";
		int myCapacity = 50;
		String myBuilding = "IT";
		
		ClassRoom obj = new ClassRoom(myID, myCapacity, myBuilding);
		
		String myClassRoom = obj.toString();
		
		System.out.println("obj: "+myClassRoom);
	}
}
