package exception;

class Test
{
	public void display() 
	{
		try {
			Class.forName("Demo.class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class CompileTimeException {
	public static void main(String[] args) {
		
		
		Test t = new Test();
		t.display();
		
	}
}
