
public interface Interface {
	
	void Area(int length, int breadth);
	}



class Rectangle implements Interface {

	@Override
	public void Area(int length, int breadth) {
		// TODO Auto-generated method stub
	System.out.println("AREA OF RECTANGLE " + (length * breadth));
	}
	
}

class Square implements Interface {

	@Override
	public void Area(int length, int breadth) {
		// TODO Auto-generated method stub
		
	System.out.println("Area of SQUARE " + (2* length * breadth) );
	}
	
}