package com.company;

public class Customer
{
    private String name;
    private String address;

    public void createCustomer(String name, String address)
    {
        this.name=name;
        this.address=address;
    }

    public void showCustomerDetails()
    {
        System.out.println("Customer Name: "+name+"\t Customer Addres: "+address);
    }

}
