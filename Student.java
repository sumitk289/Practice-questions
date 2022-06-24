package Practice_questions;
//static keyword
public class Student {
	static int cube(int a) {
		return a*a*a;
	}

	public static void main(String[] args) {
		int show=Student.cube(6);
		System.out.println(show);
		

	}

}
