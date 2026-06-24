package com;

import org.springframework.stereotype.Component;

@Component
public class LoanAccount implements Accounts {

	@Override
	public void info() {
		System.out.println("This is loan account");
		
	}

}
