package com.learning.microservice.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.learning.microservice.model.ExceptionInfo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Object> handleConflict(HttpServletRequest req, Exception ex) {
		ExceptionInfo info = new ExceptionInfo(ex.getMessage(),1000);
		return new ResponseEntity<Object>(info, HttpStatus.CONFLICT);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Object> handleNotFoundException(HttpServletRequest req, Exception ex) {
		ExceptionInfo info = new ExceptionInfo(ex.getMessage(),1001);
		return new ResponseEntity<Object>(info, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<Object> handleInternalError(HttpServletRequest req, Exception ex) {
		ExceptionInfo info = new ExceptionInfo(ex.getMessage(),1002);
		return new ResponseEntity<Object>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
