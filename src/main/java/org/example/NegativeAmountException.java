package org.example;

public class NegativeAmountException extends IllegalArgumentException {
    public NegativeAmountException(String message) {
        super(message);
    }
}
