package com.company;


interface LIBTransaction
{
    void bookIssue();
    void bookReturn();
}

public class LIBLibrarian implements  LIBTransaction
{
    public void bookIssue()
    {
        System.out.println("Issue the book to a student and Minus the Book Stock in the Library");
    }

    public void bookReturn()
    {
        System.out.println("Receive the book from student and add the Book stock in the library");
    }

}
