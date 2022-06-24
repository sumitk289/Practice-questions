package Practice_questions;

public class AreaOfCircle {
	final float pi = 22/7;
	float radius,result;
	

	public static void main(String[] args) {
		AreaOfCircle s1 = new AreaOfCircle();//s1 is new object
		s1.radius = 11.5f;
		s1.result = s1.pi*s1.radius*s1.radius;//formula of circle
		System.out.println("The area of circle:"+s1.result+"cm");
		

	}

}
