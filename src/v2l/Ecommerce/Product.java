package v2l.Ecommerce;
import java.util.ArrayList;

public class Product {
    private int pid;
    private String pname;
    private int pprice;



    public int getpId()
    {
        return this.pid;
    }

    public String getpName()
    {
        return this.pname;
    }

    public int getPrice()
    {
        return this.pprice;
    }


    public void setpId(int pid){
        this.pid=pid;
    }

    public void setPname(String pname){
        this.pname=pname;
    }
    public void setPprice(int pprice){
        this.pprice=pprice;
    }


    public String getCname(){
        Category category=new Category();
        return category.cname;
    }
    public void setCname(String cname){
        Category category=new Category();
        category.cname=cname;
    }
    public String getSname(){
        Supplier supplier=new Supplier();
        return supplier.sname;
    }
    public void setSname(String sname){
        Supplier supplier=new Supplier();
        supplier.sname=sname;
    }
    public void getAllproduct(String cname)
    {
        ProductDbo productDbo=new ProductDbo();
      productDbo.getProductByCategory(cname);
    }
    public int getProductPrice(int pid, int quantity){
        ProductDbo productDbo=new ProductDbo();
        return productDbo.getProductPriceById(pid)*quantity;

    }

}
