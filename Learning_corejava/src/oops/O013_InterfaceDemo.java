package oops;

interface Inter1
{
	public static final int i = 10;
	public void display();
	
}



interface Inter2 extends Inter1
{
	public void display();
	
}

class Interimpl implements Inter1,Inter2
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

public class O013_InterfaceDemo {
	public static void main(String[] args) {
		
		
		
		
	}
}
