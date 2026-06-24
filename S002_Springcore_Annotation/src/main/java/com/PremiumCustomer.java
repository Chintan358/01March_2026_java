package com;

import org.springframework.stereotype.Component;

@Component("premium")
public class PremiumCustomer implements Customer {

	@Override
	public void details() {
		// TODO Auto-generated method stub
		System.out.println("I am premium customer");
	}

}
