package Practice_questions;

public class Parameterizedconstructor {
	String name;
	int rollno;
	//creatingParameterizedconstructor
	Parameterizedconstructor(String n,int r){
		name=n;
		rollno=r;
	}
		
	//method for display
	void display() {System.out.println(name+""+rollno);}

	public static void main(String[] args) {
		//create object
		Parameterizedconstructor n1=new Parameterizedconstructor("sumit",45);
		Parameterizedconstructor n2=new Parameterizedconstructor("akshay",48);
		//now call method
		n1.display();
		n2.display();
		

	}

}
