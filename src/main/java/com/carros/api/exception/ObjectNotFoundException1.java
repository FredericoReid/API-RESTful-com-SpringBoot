package com.carros.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ObjectNotFoundException1 extends RuntimeException {
	public ObjectNotFoundException1(String message) {
        super(message);
    }

    public ObjectNotFoundException1(String message, Throwable cause) {
        super(message, cause);
    }
}
