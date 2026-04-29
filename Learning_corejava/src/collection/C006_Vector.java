package collection;

import java.util.ArrayList;
import java.util.Vector;

public class C006_Vector {
	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<String>();
		double startTime = System.currentTimeMillis();
		for(int i=1;i<=100000;i++)
		{
			v.addElement("java");
			v.addElement("python");
		}		
		double endTime = System.currentTimeMillis();
		
		ArrayList<String> al = new ArrayList<String>();
		double startTime1 = System.currentTimeMillis();
		for(int i=1;i<=100000;i++)
		{
		al.add("java");
		al.add("python");
		}
		double endTime1 = System.currentTimeMillis();
		 
		
		System.out.println("time taken by vector : "+(endTime-startTime));
		System.out.println("time taken by list : "+(endTime1-startTime1));
	}
}
