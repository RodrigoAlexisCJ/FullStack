package com.rod.catalog.service.gateway.v2.exception;

import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorDetail {
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	private LocalDateTime timestap;
	private String message;
	private String details;
	
	public ErrorDetail() {}

	public ErrorDetail(LocalDateTime timestap, String message, String details) {
		super();
		this.timestap = timestap;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTimestap() {
		return timestap;
	}

	public void setTimestap(LocalDateTime timestap) {
		this.timestap = timestap;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public int hashCode() {
		return Objects.hash(details, message, timestap);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorDetail other = (ErrorDetail) obj;
		return Objects.equals(details, other.details) && Objects.equals(message, other.message)
				&& Objects.equals(timestap, other.timestap);
	}

	@Override
	public String toString() {
		return "ErrorDetail [timestap=" + timestap + ", message=" + message + ", details=" + details + "]";
	}
	
}
