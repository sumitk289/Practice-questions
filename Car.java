package Practice_questions;

public class Car {
	final void msg() {System.out.println("working-->");}//final key
}
class Car2 extends Car{
	
	public static void main(String[] args) {
		new Car2().msg();

	}

}
