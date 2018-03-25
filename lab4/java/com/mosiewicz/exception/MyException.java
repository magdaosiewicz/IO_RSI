package com.mosiewicz.exception;

/**
 * Created by Magda on 25.03.2018.
 */
public class MyException extends Exception {


    String adresEmail;

    public MyException(String adresEmail) {
        this.adresEmail = adresEmail;
    }

    public MyException(String message, String adresEmail) {
        super(message);
        this.adresEmail = adresEmail;
    }
}
