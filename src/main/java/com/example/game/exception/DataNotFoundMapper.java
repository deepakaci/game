
package com.example.game.exception;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class DataNotFoundMapper extends ResponseEntityExceptionHandler {
 
	@ExceptionHandler(NoSuchElementException.class)
	public ErrorMessage handleNoSuchElementException(NoSuchElementException e){
       ErrorMessage errorMessage= new ErrorMessage("custom no such element ",HttpStatus.BAD_REQUEST,ZonedDateTime.now());
        return errorMessage; 
	  }
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		 Map<String, String> errors = new HashMap<>();
		    ex.getBindingResult().getAllErrors().forEach((error) -> {
		        String fieldName = ((FieldError) error).getField();
		        String errorMessage = error.getDefaultMessage();
		        errors.put(fieldName, errorMessage);
		    });
		return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
	}
	
	
	

}
