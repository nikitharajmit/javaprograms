package v2l.Ecommerce;

import java.time.temporal.ValueRange;

public class PurchaseProduct {
    private int purid;
    private String pname;
    private String sname;
    private String username;
    private int billamont;
    private int discountAmount;
    private int quantity;

    public int getPurid(){
        return this.purid;
    }
    public String getpname(){
       return this.pname;
    }
    public String getSname(){
        return this.sname;

    }
    public String getUsername(){
       return this.username;
    }

  /*  public int getProductId()
    {
        ProductDbo productDbo=new ProductDbo();
        return productDbo.getIdByProductName(this.pname);
    }
    public int getSupplierId()
    {
        Supplier supplier=new Supplier();
        return supplier.getIdbySupplierName(this.sname);
    }
    public int getBillamont(){
        return this.billamont;
    }
    public int getDiscountAmount(){
        return this.discountAmount;
    }
    public int getQuantity(){
        return this.quantity;
    }*/

    public boolean PurchaseDetails(int purid, String pname, String sname,String username)
    {
        boolean validate=true;
        this.purid=purid;

        ProductDbo productDbo=new ProductDbo();
        if(productDbo.getIdByProductName(pname)==0)
            validate=false;
        else
            this.pname=pname;

        Supplier supplier=new Supplier();
        if(supplier.getIdbySupplierName(sname)==0)
            validate=false;
            else
                this.sname=sname;

            User user=new User();
            if(user.getIdbyUserName(username)==0)
                validate=false;
            else
                this.username=username;

        if(validate) {
            PurchaseDbo purchaseDbo = new PurchaseDbo();
            purchaseDbo.insertPurchaseDetails(this);
        }

        return validate;


    }

}
