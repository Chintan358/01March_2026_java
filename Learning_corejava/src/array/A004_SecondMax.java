package array;

public class A004_SecondMax {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,78,45,98,68,48,98,45,12,88,74,-1,-100};
		
		int max = a[0];
		int smax = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				smax = max;
				max = a[i];
			}
			else if(a[i]>smax && a[i]!=max)
			{
				smax = a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(smax);
		
		
	}
}
