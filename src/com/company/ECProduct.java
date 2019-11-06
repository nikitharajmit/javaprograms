package com.company;

interface Discount
{
    int JAN=1;
    int FEB=2;
    int MAR=3;
    int APR=4;

    int DISCOUNTFORJANINPER=10;
    int DISCOUNTFORJANININR=100;

    int DISCOUNTFORFEBINPER=15;
    int DISCOUNTFORFEBININR=150;

    int DISCOUNTFORMARINPER=20;
    int DISCOUNTFORMARININR=200;

    int DISCOUNTFORAPRINPER=25;
    int DISCOUNTFORAPRININR=250;

    void applyDiscount(int month);

}

public class ECProduct implements Discount
{
    String productName;
    float productListPrice;
    float productSellingPrice;
    float discountValue;

    public ECProduct(String productName,float productListPrice)
    {
        this.productName=productName;
        this.productListPrice=productListPrice;
    }

    public void applyDiscount(int month)
    {
        switch(month)
        {
            case Discount.JAN:
                if(this.productListPrice>=1000)
                {
                    discountValue= Discount.DISCOUNTFORJANININR;
                    this.productSellingPrice = this.productListPrice - discountValue;
                }
                else
                    this.productSellingPrice=this.productListPrice-(this.productListPrice*Discount.DISCOUNTFORJANINPER/100);
                break;

            case Discount.FEB:
                if(this.productListPrice>=1000)
                    this.productSellingPrice=this.productListPrice-Discount.DISCOUNTFORFEBININR;
                else
                    this.productSellingPrice=this.productListPrice-(this.productListPrice*Discount.DISCOUNTFORFEBINPER/100);
                break;

            case Discount.MAR:
                if(this.productListPrice>=1000)
                    this.productSellingPrice=this.productListPrice-Discount.DISCOUNTFORMARININR;
                else
                    this.productSellingPrice=this.productListPrice-(this.productListPrice*Discount.DISCOUNTFORMARINPER/100);
                break;

            case Discount.APR:
                if(this.productListPrice>=1000)
                    this.productSellingPrice=this.productListPrice-Discount.DISCOUNTFORAPRININR;
                else
                    this.productSellingPrice=this.productListPrice-(this.productListPrice*Discount.DISCOUNTFORAPRINPER/100);
                break;
        }
    }

    public void showProductDetails()
    {
        System.out.println("Name:"+productName+"| List Price:"+productListPrice+"| Selling Price:"+productSellingPrice);
    }

}
