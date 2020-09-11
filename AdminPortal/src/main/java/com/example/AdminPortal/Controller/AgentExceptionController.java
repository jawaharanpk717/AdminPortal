package com.example.AdminPortal.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.AdminPortal.Exception.AgentNotFoundException;

@ControllerAdvice
public class AgentExceptionController {
	
	@ExceptionHandler(value = AgentNotFoundException.class)
	public ResponseEntity<Object> exception(AgentNotFoundException exception) {
		return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
		
	}

}
