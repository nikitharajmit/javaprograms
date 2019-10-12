package com.company;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookprice;
    public final int BOOK_Quantity=10;
    private String bookEdition;
    public static int BookCode;
    public int inventoryBook;

    static {
        BookCode=1010;

    }


    public void BookDetails(String bookTitle,String bookAuthor,int bookprice,String bookEdition){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookprice=bookprice;

        this.bookEdition=bookEdition;
    }
    public String showBookDetails(){
        return("Book Title:"+bookTitle+"\nBook Author"+bookAuthor+"\nBook Price:"+bookprice+"\nBook Quantity:"+BOOK_Quantity+"\nBook Edition:"+bookEdition+"\nBookCode:"+BookCode);
    }
    public void issueBook(){


        try{
            int a,b,c;

            System.out.println("Please Enter the number of book issued");
            a=10;
            b=BOOK_Quantity;
            c=b-a;
            System.out.println("Remaining books:"+c);

        }
        catch (Exception e){

        }
    }
}
