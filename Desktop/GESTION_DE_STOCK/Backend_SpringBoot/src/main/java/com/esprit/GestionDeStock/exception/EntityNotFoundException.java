package com.esprit.GestionDeStock.exception;

import lombok.Getter;

public class EntityNotFoundException extends RuntimeException {

    @Getter
    private ErrorCode errorCode ;

    public EntityNotFoundException (String msg) {
        super(msg);
    }

    public EntityNotFoundException (String msg, Throwable cause) {
        super(msg, cause);
    }

    public EntityNotFoundException(String msg, Throwable cause , ErrorCode errorCode) {
        super (msg, cause);
        this.errorCode=errorCode;
    }

    public EntityNotFoundException (String msg , ErrorCode errorCode) {
        super (msg);
        this.errorCode=errorCode;
    }
}
