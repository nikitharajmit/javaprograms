package com.company;

public class Product
{
    private int code;
    private String title;
    private String desc;
    private float price;
    private String supplierName;
    private int turnAroundInDays;

    public void createProduct(int code, String title, String desc, float price, String supplierName, int turnAroundInDays)
    {
        this.code=code;
        this.title=title;
        this.desc=desc;
        this.price=price;
        this.supplierName=supplierName;
        this.turnAroundInDays=turnAroundInDays;
    }


    public void showProductDetails()
    {
        System.out.println("CODE:"+code+" | TITLE:"+title+" | DESC:"+desc+" | PRICE:"+price+" | SUP NAME:"+supplierName+" | TAT:"+turnAroundInDays);
    }

    public float getPrice()
    {
        return price;
    }

    public int getTurnAroundInDays()
    {
        return turnAroundInDays;
    }
}
