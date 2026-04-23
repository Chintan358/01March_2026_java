package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C004_Treeset {
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("java");
		set.add("python");
		set.add("android");
		set.add("java");
		
//		Iterator<String> itr = set.descendingIterator();
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
