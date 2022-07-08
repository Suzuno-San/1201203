package homework01;

public class Subject {
	
	int id;
	String title;
	String lecturer;
	
	public Subject(int ID, String Title, String Lecturer) {
		this.id = ID;
		this.title = Title;
		this.lecturer = Lecturer;
	}
	
	public String toString() {
		String data = id+"-"+title+"-"+lecturer;
		return data;
	}
}
