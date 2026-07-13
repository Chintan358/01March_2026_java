package streamapi;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> iter = new ArrayList<>();
		iter.add(1);
		iter.add(8);
		iter.add(3);
		iter.add(7);
		iter.add(5);
		
//		ArrayList<Integer> iter1 = new ArrayList<>();	
//		for(int i : iter)
//		{
//			iter1.add(i*i);
//		}
//		
//		System.out.println(iter1.toString());
		
		
//		List<Integer> al =  iter.stream().map((ele)->ele*ele).collect(Collectors.toList());
//		System.out.println(al.toString());
		
		
		
		ArrayList<String> str = new ArrayList<>();
		str.add("java");
		str.add("python");
		str.add("php");
		str.add("android");
		str.add("node");
//		
//		List<Integer> a2 =  str.stream().map((ele)->ele.length()).collect(Collectors.toList());
//		System.out.println(a2.toString());
		
		
//		List<Integer> i = iter.stream().filter((ele)->ele%2!=0).collect(Collectors.toList());
//		System.out.println(i.toString());
		
		
//		List<String> i = str.stream().filter((ele)->ele.startsWith("p")).collect(Collectors.toList());
//		System.out.println(i.toString());
//		
//		List<String> i1 = str.stream().filter((ele)->ele.contains("o")).collect(Collectors.toList());
//		System.out.println(i1.toString());
		
		
//		Integer it =  iter.stream().reduce(0,(a,b)->a+b);
//		System.out.println(it);
		
		Integer it =  iter.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(it);
		
		
	}
}
