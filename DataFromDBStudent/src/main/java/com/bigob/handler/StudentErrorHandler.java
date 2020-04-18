package com.bigob.handler;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentErrorHandler {

	@ExceptionHandler(EmptyResultDataAccessException.class)
	public String handelError() {
		return "errorHome";
	}
}
