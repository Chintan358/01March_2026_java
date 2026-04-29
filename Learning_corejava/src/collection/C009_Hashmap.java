package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class C009_Hashmap {
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 100);
		map.put("python", 200);
		map.put("android", 402);
		map.put("sql", 200);
		map.put("java", 500);
		
		//System.out.println(map.get("java1"));
		System.out.println(map);
//		Set s = map.entrySet();
//		Iterator itr =s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		for(Entry<String, Integer> m : map.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
		
		
	}
}
