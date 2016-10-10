package com.lavr.second.factory;

/**
 * Created by 123 on 02.10.2016.
 */
public class IllegalVegetableException extends Exception {
    public IllegalVegetableException() {
    }

    public IllegalVegetableException(String message) {
        super(message);
    }

    public IllegalVegetableException(String message, Throwable cause) {
        super(message, cause);
    }
}
