package Test;

public class Student {
	int id;
	String name;
	String surname;
	int mark;
	char grade;
	
	public char grading(int mark) {
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
	
	public Student(int id, String name, String surname, int mark) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mark = mark;
		this.grade = ' ';
	}
	
	public String toString() {
		return this.id+"-"+this.name+"-"+this.surname+"-"+this.mark+"-"+this.grade;
	}
}
