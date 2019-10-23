package com.company;

public class CustomerTranscation
{
    private Product _product;
    private Customer _customer;
    private String _purchase_date;
    private int _qty;
    private float _price;
    private int _noOfDays;

    public void purchase(Product product, Customer customer,String purchase_date, int qty)
    {
        _product=product;
        _customer=customer;
        _purchase_date=purchase_date;
        _qty=qty;

        //Calculation based on the object properties for the given Product
        _price=_qty * _product.getPrice();
        _noOfDays=_product.getTurnAroundInDays();

    }

    public void showPurchaseDetails()
    {
        _product.showProductDetails();
        _customer.showCustomerDetails();
        System.out.println("Qty:"+_qty+"\tAmount:"+_price+"\tDate:"+_purchase_date+"\tTAT:"+_noOfDays);
    }

}
