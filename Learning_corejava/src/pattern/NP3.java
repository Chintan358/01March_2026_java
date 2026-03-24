package pattern;

public class NP3 {
	public static void main(String[] args) {
		
//		5
//		45
//		345
//		2345
//		12345
		
		
		int lines = 5;
		
		for(int j=lines;j>=1;j--)
		{
			for(int i=0;i<=lines-j;i++)
			{
				System.out.print(j+i);	
			}
			System.out.println();
		}
		
		
		
	}
}
