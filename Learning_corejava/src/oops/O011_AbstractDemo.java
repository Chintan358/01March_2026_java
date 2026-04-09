package oops;

abstract class Abs
{
	abstract public void display();
	
	public void test()
	{
		System.out.println("Test calling");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display calling");
	}
	
}

public class O011_AbstractDemo {
	public static void main(String[] args) {
		
//		AbsImpl abs = new AbsImpl();
//		abs.display();
//		abs.test();
		
//		Abs abs = new Abs() {
//			
//			@Override
//			public void display() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		
	}
}
