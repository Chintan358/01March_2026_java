package logical;

public class OTD {
	public static void main(String[] args) {
		
		int number = 233;
		int p=0;
		int sum = 0;
		while(number!=0)
		{
			int rem = number%10;
			sum+=(rem*Math.pow(8, p));
			number = number/10;
			p+=1;
		}
		
		System.out.println(sum);
	}
}
