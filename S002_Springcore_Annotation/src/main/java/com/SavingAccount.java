package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("saving")
public class SavingAccount implements Accounts {

	@Autowired
	@Qualifier("premium")
	Customer customer;
	
	@Override
	public void info() {
		System.out.println("This is saving account");
		customer.details();
	}

}
