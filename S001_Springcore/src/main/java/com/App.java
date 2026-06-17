package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student st = cx.getBean("std",Student.class);
		System.out.println(st.getId()+" "+st.getName()+" "+st.getEmail());
		
		for(String s : st.subjects)
		{
			System.out.println(s);
		}
		
		for(String l : st.languages)
		{
			System.out.println(l);
		}
		
		Address adr = st.getAddress();
		System.out.println(adr.getCity()+" "+adr.getState()+" "+adr.getCountry());
	}
}
