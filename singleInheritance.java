class Animal {
	
	String name;
	
	public void bark() {
		System.out.println("Barks everytime.");
	}
}
class Dog extends Animal {
	
	public void names() {
		System.out.println(name);
	}
}
public class singleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog kuku = new Dog();
		kuku.name = "Doggy";
		kuku.bark();
		kuku.names();
		

	}

}
