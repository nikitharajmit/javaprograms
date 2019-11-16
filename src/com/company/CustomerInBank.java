package com.company;

public class CustomerInBank
{
    private int customerID;
    private String customerName;
    private  int accountNum;
    private String accountType;
    private float balanceAmount;

    public void bankDetails(int cID,String cName,int aNum,String aType,float balance){
        customerID=cID;
        customerName=cName;
        accountNum=aNum;
        accountType=aType;
        balanceAmount=balance;
    }
    public void showDetails(){
        System.out.println("ID:"+customerID+"\nName:"+customerName+"\nAccount Number:"+accountNum+"\nAccount Type:"+accountType+"Account balance:"+balanceAmount);
    }
    public void addInterest()
    {
        balanceAmount=balanceAmount+interestAmount(20);
    }

    private float interestAmount(int interestInPercentage)
    {
        return balanceAmount*(float)interestInPercentage/100;
    }
}
