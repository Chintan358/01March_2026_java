package collection;

import java.util.Comparator;

public class SortByQty implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		
		int i=0;
		if(o1.qty>o2.qty)
		{
			i = 1;
		}
		else if(o1.qty<o2.qty)
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
