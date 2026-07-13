package streamapi;


interface Inter{
	
	//public void display();
	public void add(int a, int b);
	
}




public class Demo {
	public static void main(String[] args) {
		
		
	
//		Inter iter = new Inter() {
//			
//			@Override
//			public void display() {
//				// TODO Auto-generated method stub
//				System.out.println("Hello");
//			}
//		};
//		
//		iter.display();
		
		
		Inter inter = (a,b)-> System.out.println(a+b);
		inter.add(10,20);
		
		
	}
}
