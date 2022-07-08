package homework01;

public class ClassRoom {
	
	String ID;
	int Capacity;
	String Building;
	
	public ClassRoom(String ID, int Capacity, String Building) {
		this.ID = ID;
		this.Capacity = Capacity;
		this.Building = Building;
	}
	
	public String toString() {
		String data = ID+"-"+Capacity+"-"+Building;
		return data;
	}
}
