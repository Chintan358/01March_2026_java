package logical;

public class DTH {
	public static void main(String[] args) {
		
		int number = 155;
		int sum = 0;
		int m = 1;
		while(number!=0)
		{
			int rem = number%8;
			sum = sum + (rem*m);
			number/=8;
			m = m*10;
		}
		
		System.out.println(sum);
	
		
	}
}
