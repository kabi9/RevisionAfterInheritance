abstract class Student{

	abstract void teach();
	
	public void learn() {
		System.out.println("Learning myself");
	}
}
class Teacher extends Student{
	
	public void teach() {
		System.out.println("Teach by teacher");
	}
}
	

public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher c = new Teacher();
		c.learn();
		c.teach();
	}

}
