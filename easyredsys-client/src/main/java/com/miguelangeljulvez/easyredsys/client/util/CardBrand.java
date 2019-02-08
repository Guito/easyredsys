package com.miguelangeljulvez.easyredsys.client.util;

import java.util.Arrays;

public enum CardBrand {

    VISA(1),
    MASTERCARD(2),
    AMEX(8),
    JCB(9),
    UPI(22),
    DINERS(6),
    CUP(22),
    PRIVATE(7),
    UNKNOWN(null);

    private Integer code;

    CardBrand(Integer code) {
        this.code = code;
    }

    public static CardBrand getCard(Integer code) {
        if (code == null) {
            return null;
        }
        return Arrays.stream(values()).filter(cb -> code.equals(cb.code)).findFirst().orElse(UNKNOWN);
    }

}
