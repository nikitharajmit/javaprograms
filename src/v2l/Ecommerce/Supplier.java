package v2l.Ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Supplier {

private int sid;
private String sname;

    public String getSname(){
        return this.sname;
    }
    public void setSname(String sname){

        this.sname=sname;
    }
    public int getSid(){
        SupplierDbo supplierDbo=new SupplierDbo();
        return supplierDbo.getIdbySupplierName(this.sname);
    }
    public void setSid(int sid){
        SupplierDbo supplierDbo=new SupplierDbo();
        sname=supplierDbo.getNamebySupplierId(sid);
    }

    public static ArrayList<String> getSupplierNameTochoose(){
        SupplierDbo supplierDbo=new SupplierDbo();
        return supplierDbo.getSupplierNames();
    }


}
