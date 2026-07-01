package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> MethodArgumentNotValidExceptionHanlder(MethodArgumentNotValidException e)
	{
			Map<String, String> map = new HashMap<>();
			
			e.getBindingResult().getFieldErrors()
            .forEach(error ->
                    map.put(error.getField(), error.getDefaultMessage()));
			
			return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}
}
