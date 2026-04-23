package collection;

import java.util.HashSet;

public class C003_Hashset {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("python");
		set.add("android");
		set.add("java");
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
		
	}
}
