package com.chaofan.excep;

/**
 * @author yan
 * @create 2021 - 05 - 30 19:12
 */
public class NotEnoughException extends RuntimeException {

    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
