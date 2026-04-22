package thread;

class Calc
{
	synchronized public void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+(i*n));
		}
	}
}

class User extends Thread
{
	Calc c;
	User(Calc c)
	{
		this.c = c;
	}
	@Override
	public void run() 
	{
		c.table(5);
	}
}

public class MethodSync {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		User u1 = new User(c);
		User u2 = new User(c);
		
		u1.start();
		u2.start();
		
	}
}
