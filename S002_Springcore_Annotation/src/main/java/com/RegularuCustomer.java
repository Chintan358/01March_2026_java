package com;

import org.springframework.stereotype.Component;

@Component("regular")
public class RegularuCustomer implements Customer {

	@Override
	public void details() {
		System.out.println("I am regular customer");
		
	}

}
