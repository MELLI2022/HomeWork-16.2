package org.example;

import javax.management.RuntimeErrorException;

public class NullItemException extends RuntimeErrorException {
    public NullItemException() {
        super(e);
    }

    public NullItemException(Error e, String message) {
        super(e, message);
    }


}
