package v2l.Ecommerce;

import com.company.Cat;

import java.time.temporal.ValueRange;
import java.util.ArrayList;

public class PurchaseProduct {
    private int pid;
    private String pname;
    private int pprice;
    private String cname;
    private String sname;

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

    public String getCname(){
        return this.cname;
    }
    public String getSname(){
        return this.sname;
    }

    public int getCid(){
        Category category=new Category();
        return category.getIdbyCategoryName(this.cname);
    }
    public int getSid(){
        Supplier supplier=new Supplier();
        return supplier.getIdbySupplierName(this.sname);
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
    public void setCid(int cid){
        Category category=new Category();
        cname=category.getCategoryNamebyId(cid);
    }
    public void setSname(int sid){
        Supplier supplier=new Supplier();
        sname=supplier.getNamebySupplierId(sid);
    }
    public boolean createProduct(int pid,String pname,int pprice,String cname,String sname) {
        boolean validate = true;
        this.pid = pid;
        this.pprice = pprice;
        this.pname = pname;

        Category category = new Category();
        if (category.getIdbyCategoryName(cname) == 0)
            validate = false;
        else
            this.cname = cname;

        Supplier supplier = new Supplier();
        if (supplier.getIdbySupplierName(sname) == 0)
            validate = false;
        else
            this.sname = sname;
        if (validate){
            ProductDbo productDbo = new ProductDbo();
        productDbo.insertProduct(this);
    }

        return validate;
    }
    public static ArrayList<String> getCategoryNameTochoose(){
        Category category=new Category();
        return category.getCategoryNames();
    }
    public static ArrayList<String> getSupplierNameTochoose(){
        Supplier supplier=new Supplier();
        return supplier.getSupplierNames();
    }




}
