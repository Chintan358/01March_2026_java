package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext cx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Accounts saving = new SavingAccount();
//		Accounts loan = new LoanAccount();
		
		Accounts saving = cx.getBean("saving",Accounts.class);
		Accounts loan = cx.getBean("loanAccount",Accounts.class);
		
		saving.info();
		loan.info();
		
		
	}
}
