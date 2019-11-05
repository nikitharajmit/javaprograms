package com.company;

public class LIBStudent implements LIBTransaction
{
    public void bookIssue()
    {
        System.out.println("Take back the book issues by the Librarian to home");
    }

    public void bookReturn()
    {
        System.out.println("Return the book to Librarian and get an acknowledgement");
    }

}
