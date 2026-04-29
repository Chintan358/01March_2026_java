package collection;

import java.util.ArrayList;
import java.util.Collections;

public class C008_ProductList {
	public static void main(String[] args) {
		
			ArrayList<Product> prod = new ArrayList<Product>();
			
			Product p1= new Product("Keyboard", 1500, 10);
			
			prod.add(new Product("Pen", 10, 5));
			prod.add(new Product("Fan", 1500, 2));
			prod.add(new Product("TV", 700, 15));
			prod.add(new Product("Mouse", 400, 12));
			prod.add(p1);
			
//			Collections.sort(prod,new SortByQty());
//			Collections.sort(prod,new SortByPrice());
			Collections.sort(prod,new SortByName());
			for(Product p : prod)
			{
				System.out.println(p);
			}
		
	}
}
