package org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cx = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		Employee e = cx.getBean("emp",Employee.class);
		e.display();
		
	}
}
