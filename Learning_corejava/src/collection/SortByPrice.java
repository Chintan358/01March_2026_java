package collection;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		
		int i=0;
		if(o1.price>o2.price)
		{
			i = 1;
		}
		else if(o1.price<o2.price)
		{
			i=-1;
		}
		else
		{
			i=0;
		}
		return i;
	}

}
