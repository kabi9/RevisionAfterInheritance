class Overloading{
	public void multiply() {
		System.out.println("*");
	}
	public void multiply(char symbol) {
		System.out.println('$');
	}
}

class Gf {
	
	String fn;
	String ln;
	
	Gf(String fn,String ln){
	this.fn = fn;
	this.ln = ln;
	}
	
	public void names() {
		System.out.println(this.fn + this.ln);
	}
}

class F extends Gf {
	String Ffn;
	
	F(String fn, String ln, String Ffn){
		super(fn,ln);
		this.Ffn = Ffn;
	}
	
	public void names() {
		System.out.println(this.Ffn + this.fn + this.ln);
		super.names();
	}
	
}

class c extends F {
	String sfn;
	
	c(String fn, String ln, String Ffn, String sfn){
		super(fn,ln,Ffn);
		this.sfn = sfn;
	}
	
	public void names() {
		System.out.println(this.sfn + this.Ffn + this.ln);
		super.names();
	}
	
}

class Big{
	public void language() {
		System.out.println(" Main programming language");
	}
}

class Small extends Big{
	
	public void language() {
		System.out.println(" Java language");
		super.language();
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Inheritance
		c rabindra = new c("shailendra","adhikari","kabindra","rabindra");
		rabindra.names();
		

		// overriding (different class,same method,different signature)
				Small m1 = new Small();
				m1.language();
				
		// overloading (same class,same method,different signature)
				Overloading p1 = new Overloading();
				p1.multiply();
				p1.multiply('$');
			
	}

}
