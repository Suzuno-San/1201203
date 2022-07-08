package week2;

public class Student {
	int id;
	String name;
	String surname;
	int mark;
	char grade;
	
	public void grading () {	
		if(this.mark <= 49) {
			this.grade = 'F';
		}
		else if(this.mark <= 59) {
			this.grade = 'D';
		}
		else if(this.mark <= 69) {
			this.grade = 'C';
		}
		else if(this.mark <= 79) {
			this.grade = 'B';
		}
		else {
			this.grade = 'A';
		}
	}
	
	public Student(int id, String name, String surname, int mark) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mark = mark;
	}
	
	public String toString() {
		return id+"-"+name+"-"+surname+"-"+mark+"-"+grade;
	}
}
