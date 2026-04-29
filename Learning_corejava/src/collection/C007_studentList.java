package collection;

import java.util.ArrayList;
import java.util.Collections;

public class C007_studentList {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		
		al.add(new Student(1, "abc", "abc@gmail.com"));
		al.add(new Student(3, "xyz", "xyz@gmail.com"));
		al.add(new Student(2, "pqr", "pqr@gmail.com"));
		
		Collections.sort(al);
		
		for(Student st : al)
		{
			//st.display();	
			System.out.println(st);
		}
		
		}
}
