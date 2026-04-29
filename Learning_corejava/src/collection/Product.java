package collection;

public class Product {
	
		String name;
		double price;
		int qty;
		public Product(String name, double price, int qty) {
			super();
			this.name = name;
			this.price = price;
			this.qty = qty;
		}
		
		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + ", qty=" + qty + "]";
		}
		
		
}
