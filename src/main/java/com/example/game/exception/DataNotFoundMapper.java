package com.example.game.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class DataNotFoundMapper {

	@ExceptionHandler(value = { DataNotFoundException.class })
	public ResponseEntity<Object> handleDataNotFoundException(DataNotFoundException e) {
		ErrorMessage errorMessage = new ErrorMessage(e.getMessage(), HttpStatus.BAD_REQUEST,
				ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));

		return new ResponseEntity<Object>(errorMessage, HttpStatus.BAD_REQUEST);
	}
	

	

	    @ExceptionHandler(NoHandlerFoundException.class)
	    public String handleNotFoundResourceException(HttpServletRequest request, NoHandlerFoundException e) {
	       
	       return "Requested resource wasn't found on the server";
	       
	    }
	
}
