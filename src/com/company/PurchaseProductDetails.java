package com.company;
interface discount{
    void applyDiscount(String productdiscountCode);
    String DIS10="10";
    String DIS20="20";
    String DIS30="30";
   int SHIPPINGCHARGE=150;
}
public class PurchaseProductDetails implements discount {
    private EcommerceProductDetails product[]=new EcommerceProductDetails[4];
    private UserRegistration user;
    private ProductDiscount productDiscount;
    private int productCounter=0;
    private int userCounter=0;


    public PurchaseProductDetails(){
        for (int i=0;i<5;i++){
            product[i]=new EcommerceProductDetails();
        }
    }

    public void setProductDetails(String productCode,String productName,float productPrice,String categoryName,String supplierName){
        product[productCounter].createProduct(productCode,productName, productPrice,categoryName,supplierName);
        productCounter++;
    }
    public void setUser(String userName){
        user.inputUserName(userName);

    }
    public void createProductDiscount(String discountCode)
    {
        productDiscount.setDiscountCode("discountCode");
    }
    public void getProductDetails(){
        for(int i=0;i<5;i++){
            product[i].displayProductDetals();
        }
    }
    public void getUser(){
            user.ouputUserName();
    }
         public void showProductDiscount(){
            productDiscount.getDiscountCode();
        }

    public void applyDiscount(String productdiscountCode){
        switch (productdiscountCode)
        {
            case DIS10:


        }
    }
    {



    }


}
