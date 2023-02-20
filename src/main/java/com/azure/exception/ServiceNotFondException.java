package com.azure.exception;

public class ServiceNotFondException extends Exception{
    public ServiceNotFondException() {
    }

    public ServiceNotFondException(String message) {
        super(message);
    }

    public ServiceNotFondException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceNotFondException(Throwable cause) {
        super(cause);
    }

    public ServiceNotFondException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
