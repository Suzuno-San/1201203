package homework1;

public class Grade {
	public static char grading(int mark) {
		if(mark >= 80 && mark <=100) {
			return 'A';
		}
		else if(mark >= 70 && mark < 80) {
			return 'B';
		}
		else if(mark >= 60 && mark < 70) {
			return 'C';
		}
		else if(mark >= 50 && mark < 60) {
			return 'D';
		}
		else if(mark >= 0 && mark < 50) {
			return 'F';
		}
		else {
			return ' ';
		}
	}
}
