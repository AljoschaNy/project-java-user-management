package org.example.exception;

public class NoSuchUserException extends Exception{
    public NoSuchUserException(String message) {
        super(message);
    }
    public NoSuchUserException(){
        super("There is no user");
    }
}
