package com.company;

public class ProductSupplier {
    public String supplierName;

    public void inputSupplierName(String supplierName){
        this.supplierName=supplierName;
    }
    public void showSupplierName(){
        System.out.println("SupplierName:"+supplierName);
    }
}
