package impclasses;

public class I004_StringBuffer {
	public static void main(String[] args) {
		
		double startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb.append("python");
		}
		double endTime = System.currentTimeMillis();
		
		double startTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=1;i<=1000000;i++)
		{
			sb1.append("python");
		}
		double endTime1 = System.currentTimeMillis();
		
		System.out.println("time taken by buffer : "+(endTime-startTime));
		System.out.println("time taken by builder : "+(endTime1-startTime1));
		
	}
}
