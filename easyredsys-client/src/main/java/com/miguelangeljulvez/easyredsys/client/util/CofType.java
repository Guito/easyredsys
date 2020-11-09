package com.miguelangeljulvez.easyredsys.client.util;

public enum CofType {

    INSTALLMENTS("I"),
    RECURRING("R"),
    REAUTHORIZATION("H"),
    RESUBMISSION("E"),
    DELAYED("D"),
    INCREMENTAL("M"),
    NO_SHOW("N"),
    OTHERS("C");

    private final String code;

    CofType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
