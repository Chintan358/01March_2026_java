package com.example.demo.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException e)
	{
		APIResponse api = new APIResponse();
		api.setMessage(e.getMessage());
		api.setSuccess(false);
		
		return new ResponseEntity<>(api,HttpStatus.BAD_REQUEST);
	}
	
}
