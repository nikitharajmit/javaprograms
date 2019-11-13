package com.company;

public class SalaryIncrementExceededException extends Exception
{
    public SalaryIncrementExceededException()
    {
        super();
    }

    public String toString()
    {
        return "My Custom Class and Exception Description";
    }
}
