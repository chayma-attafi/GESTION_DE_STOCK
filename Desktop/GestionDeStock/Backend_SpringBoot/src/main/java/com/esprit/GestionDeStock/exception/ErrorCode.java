package com.esprit.GestionDeStock.exception;

public enum ErrorCode {
    ARTICLE_NOT_FOUND(10000),
    CATEGORY_NOT_FOUND(2000),
    //TODO complete the rest of the error
    MVTSTOCK_NOT_FOUND(40000),
    UTILISATEUR_NOT_FOUND(110000);
    private int code ;

    ErrorCode (int cd) {
        this.code=cd;
    }

    public int getCode() {
        return code;
    }
}
