package com.example.demo.util;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String resource, String field, int id) {
		
		super(String.format("%s with %s : %s is not found", resource,field,id));
		
	}
}
