package logical;

public class Compounding {
	public static void main(String[] args) {
		
		
			int r = 1;
			int sum = 0;
			for(int i=1;i<=64;i++)
			{
				sum+=r;
				r = r*2;
			}
			
			System.out.println(sum);
		
	}
}
