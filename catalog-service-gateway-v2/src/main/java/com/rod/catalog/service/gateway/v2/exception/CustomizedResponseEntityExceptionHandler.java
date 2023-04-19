package com.rod.catalog.service.gateway.v2.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rod.catalog.service.gateway.v2.model.OrderNotFoundException;


@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetail> handleAllException(Exception ex, WebRequest request) {
		ErrorDetail errorDetail = new ErrorDetail(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(errorDetail, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(OrderNotFoundException.class)
	public final ResponseEntity<ErrorDetail> handleOrderNotFoundException(Exception ex, WebRequest request) {
		ErrorDetail errorDetail = new ErrorDetail(LocalDateTime.now(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
	}
	
	@Override 
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception, 
			HttpHeaders header, HttpStatus status, WebRequest request) {
		ErrorDetail errorDetail = new ErrorDetail(LocalDateTime.now(), exception.getFieldError().getDefaultMessage(), 
				request.getDescription(false));
		return new ResponseEntity<>(errorDetail, HttpStatus.BAD_REQUEST);
	}
	
}

