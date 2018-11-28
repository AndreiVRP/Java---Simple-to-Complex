package com.learning.exception;

//Runtime exception = unchecked exception
public class InvalidInputParamException extends RuntimeException {

    public InvalidInputParamException() {
    }

    public InvalidInputParamException(String message) {
        super(message);
    }

    public InvalidInputParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputParamException(Throwable cause) {
        super(cause);
    }

    public InvalidInputParamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
