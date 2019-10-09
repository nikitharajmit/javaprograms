package com.company;

public class BankCustomer
{
    private int accountNo;
    private int initialBalance;
    private String custName;

    public void input(int accountNo, String custName)
        {
        //Code goes here
        this.accountNo=accountNo;
        this.custName=custName;
        }

    public void input(int accountNo, String custName, int initialBalance)
    {
        //Code goes here
        this.accountNo=accountNo;
        this.custName=custName;
        this.initialBalance=initialBalance;
    }

    public void output()
        {
        //Code goes here
        System.out.println("Acc No:"+accountNo+"\nCust Name:"+custName+"\nInit Balance:"+initialBalance);
        }

    public String getCustomerDetails()
    {
        String custDetails;
        //Code goes here
        custDetails="Acc No:"+accountNo+"\nCust Name:"+custName+"\nInit Balance:"+initialBalance;
        return custDetails;
    }

    public int getInitialBalance()
    {
        return initialBalance;
    }

    //Constructor
    public BankCustomer()
        {
        //Constructor code goes here
            initialBalance=2500;
        }

    public BankCustomer(int initialBalance)
    {
        //Constructor code goes here
        this.initialBalance=initialBalance;
    }
}

