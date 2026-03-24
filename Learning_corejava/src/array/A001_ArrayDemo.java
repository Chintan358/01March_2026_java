package array;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		//declaration
//		int[] a = new int[6];
//		
//		//intialization
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
		System.out.println("*******************");
		
		int a[] = {10,20,30,40,50,60};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("********************0");
		
		String sub[] = {"java","python","node","php"};
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
		
		System.out.println("*************");
		char ch[] = {'a','b','c','d','e','f'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
	}
}
