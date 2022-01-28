package com.example.game.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

	private String errorMessage;
	private HttpStatus status;
	private ZonedDateTime dateTime;
	

	public String getErrorMessage() {
		return errorMessage;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public ErrorMessage(String errorMessage, HttpStatus status, ZonedDateTime dateTime) {
		super();
		this.errorMessage = errorMessage;
		this.status = status;
		this.dateTime = dateTime;
	}

	public ZonedDateTime getDateTime() {
		return dateTime;
	}

}
