package Practice_questions;
//overridng
public class Vehicle {
	void msg() {System.out.println("It is working");}
}
class Vehicle2 extends Vehicle{
	void Msg() {System.out.println("It is working Good");}
	
	public static void main(String[] args) {
		Vehicle2 v1= new Vehicle2(); 
		v1.Msg();
		

	}

}
