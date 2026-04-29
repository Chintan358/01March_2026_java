package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C002_Arraylist {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(30);
		
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.addAll(al);
		al1.add(700);
		al1.add(500);
		al1.add(300);
		
		Collections.sort(al1);
		
		for(int i : al1)
		{
			System.out.println(i);
		}
		
		
		
		
	}
}
