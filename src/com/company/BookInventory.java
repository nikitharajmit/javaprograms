package com.company;

public class BookInventory
{
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookEdition;
    private int book_available;
    private int book_purchased;

    public void inputBookDetails(int bookId,String bookTitle,String bookAuthor, String bookEdition,int book_purchased)
    {
        this.bookId=bookId;
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookEdition=bookEdition;
        this.book_purchased=book_purchased;
        book_available=book_purchased;
    }


    public String getBookDetails()
    {
        return "Book ID="+bookId+"\nBook Title"+bookTitle+"\nBook Author"+bookAuthor+"\nBook Edition"+bookEdition+"\nBook Purchased"+book_purchased+"\nBook available"+book_available+"\n\n";

    }

    public boolean issueBook(int qty)
    {
        /*if(book_available>qty) {
            book_available -= qty; // book_available=book_available-qty;
            return true;
        }
        else
        {
            return false;
        }*/

        if(book_available>qty) {

            book_available -= qty; // book_available=book_available-qty;
            return true;
        }
            return false;

    }

    public boolean returnBook(int qty)
    {
        if(book_purchased>=book_available+qty) {

            book_available += qty; // book_available=book_available-qty;
            return true;
        }
        return false;
    }

}
