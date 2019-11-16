package com.company;

public class ProductDiscount {
    private String discountCode;

    public void setDiscountCode(String discountCode)
    {
        this.discountCode=discountCode;
    }
    public void getDiscountCode()
    {
        System.out.println("Discount Code"+discountCode);
    }
}
