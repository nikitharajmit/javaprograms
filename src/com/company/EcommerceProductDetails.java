package com.company;

public class EcommerceProductDetails extends CategoryProductName {
    private ProductSupplier supplierName=new ProductSupplier();

    private String productCode;
    private String productName;
    private float productPrice;
    private String categoryName;

    public void createProduct(String productCode,String productName,float productPrice,String categoryName,String supplierName){
        this.productCode=productCode;
        this.productName=productName;
        this.productPrice=productPrice;
        super.inputCategoryName("categoryName");
        this.supplierName.inputSupplierName("supplierName");
    }
    public void displayProductDetals(){
        System.out.println("Product Code:"+productCode);
        System.out.println("Product Name:"+productName);
        System.out.println("Product Price:"+productPrice);
        this.supplierName.showSupplierName();
    }
    public float getProductprice(){
        return productPrice;
    }
}
