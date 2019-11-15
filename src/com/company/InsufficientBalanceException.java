package com.company;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg)
    {
        super(msg);
    }

}
