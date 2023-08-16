package com.esprit.GestionDeStock.exception;

import lombok.Getter;

import java.util.List;

public class InvalidEntityException extends RuntimeException{

    @Getter
    private ErrorCode errorCode ;

    @Getter
    private List<String> errors;

    public InvalidEntityException (String msg) {
        super(msg);
    }

    public InvalidEntityException (String msg, Throwable cause) {
        super(msg, cause);
    }

    public InvalidEntityException(String msg, Throwable cause , ErrorCode errorCode) {
        super (msg, cause);
        this.errorCode=errorCode;
    }

    public InvalidEntityException (String msg , ErrorCode errorCode , List<String> errors) {
        super(msg);
        this.errorCode=errorCode;
        this.errors=errors;
    }
}
