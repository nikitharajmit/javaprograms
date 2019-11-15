package com.company;


public class Bank
{
    public class BankTransaction
    {
        private int accountBalance;

        public BankTransaction()
        {
            accountBalance=5100;
        }

        public void withdraw(int withdrawAmount) throws InsufficientBalanceException
        {
            if(accountBalance-withdrawAmount>=0)
            {
                accountBalance-=withdrawAmount;
            }
            else
            {
                InsufficientBalanceException insufficientBalanceException=new InsufficientBalanceException("Balance is Zero");
                if(violationOfMonthlyAvgBalance())
                {
                    AvgBalanceException avgBalanceException=new AvgBalanceException("Monthly AVG Balance Not maintained. Hence fine applied");
                    insufficientBalanceException.initCause(avgBalanceException);
                }

                throw  insufficientBalanceException;


            }
        }

        public void deposit(int depositAmount)
        {
            accountBalance+=depositAmount;
        }

        public boolean violationOfMonthlyAvgBalance()
        {
            return true;
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
