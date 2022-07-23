package lect03;

public class Student {
	String name;
	String surname;
	int mark;
	char grade;
	
	public Student(String name, String surname, int mark) {
		this.name = name;
		this.surname = surname;
		this.mark = mark;
		this.grade = ' ';
	}
	
	public String toString() {
		return "Name: "+this.name+" Surname: "+this.surname+" Mark: "+this.mark+" Grade: "+this.grade;
	}
}
