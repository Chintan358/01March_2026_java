package collection;

import java.util.HashMap;

public class C010_MapExmaple {
	public static void main(String[] args) {
		
			String str = "hello java hello python hello";
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			String words[] = str.split(" ");
			
			for(int i=0;i<words.length;i++)
			{
				if(map.get(words[i])==null)
				{
					map.put(words[i], 1);
				}
				else
				{
					int k = map.get(words[i]);
					k++;
					map.put(words[i], k);
				}
			}
		
			System.out.println(map);
		
	}
}
