
public interface InterfaceInheritance {
	void loanA();
	void loanB();
	}	
interface IIB extends InterfaceInheritance {
	void loanC();
	void loanD();
	}


class IIC implements IIB {

	@Override
	public void loanA() {
		// TODO Auto-generated method stub
		System.out.println("I am from first interface");
	}

	@Override
	public void loanB() {
		// TODO Auto-generated method stub
		System.out.println("I am from first interface");
	}

	@Override
	public void loanC() {
		// TODO Auto-generated method stub
		System.out.println("I am from 2nd interface");
	}

	@Override
	public void loanD() {
		// TODO Auto-generated method stub
		System.out.println("I am from 2nd interface");
	}
	
}