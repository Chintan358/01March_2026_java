package oops;

class Parent
{
	public void display()
	{
		System.out.println("Parent calss display calling");
	}
}

class  child extends Parent
{
	@Override
	public void display() {
		System.out.println("Child duisplay calling");
		//super.display();
	}
}

public class O010_Methodoverriding {
	public static void main(String[] args) {
		
		child c = new child();
		c.display();
		
//		final int i = 10;
//		i = 50;
//		System.out.println(i);
	}
}
