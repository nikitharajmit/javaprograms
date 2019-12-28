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




}
