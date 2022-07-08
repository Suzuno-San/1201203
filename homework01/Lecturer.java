package homework01;

public class Lecturer {
	
	int id;
	String name;
	String surname;
	
	public Lecturer(int ID, String Name, String Surname) {
		this.id = ID;
		this.name = Name;
		this.surname = Surname;
	}
	
	public String toString() {
		String data = id+"-"+name+"-"+surname;
		return data;
	}
}
