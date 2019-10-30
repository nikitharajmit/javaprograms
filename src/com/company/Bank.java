package com.company;

public class Bank
{
    public class BankTransaction
    {
        private int accountBalance;

        public BankTransaction()
        {
            accountBalance=25000;
        }

        public boolean withdraw(int withdrawAmount)
        {
            if(accountBalance-withdrawAmount>=25000)
            {
                accountBalance-=withdrawAmount;
                return true;
            }
             return false;
        }

        public void deposit(int depositAmount)
        {
            accountBalance+=depositAmount;
        }

        public int getAccountBalance()
        {
            return accountBalance;
        }
    }

    private int bankCode;
    private String bankName;
    public BankTransaction bankTransaction;

    public Bank(String bankName, int bankCode)
    {
        this.bankCode=bankCode;
        this.bankName=bankName;
        bankTransaction=new BankTransaction();
    }

    /*public boolean withdraw(int withdrawAmount)
    {
        return bankTransaction.withdraw(withdrawAmount);
    }

    public void deposit(int depositAmount)
    {
        bankTransaction.deposit(depositAmount);
    }*/

    public void showAccountBalance()
    {
        System.out.println("BankCode:"+bankCode+"  BankName:"+bankName+"\nAccountBalance:"+bankTransaction.getAccountBalance());
    }
}
