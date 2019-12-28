package v2l.Ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SupplierDbo {
    private Connection connection;
    private Statement statement;
    public SupplierDbo()
    {
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Learn@v2l");
        }
        catch(Exception e){
            System.out.println("DB Connection Failed!...");
        }
    }


    public int getIdbySupplierName(String sname)
    {
        int sid=0;
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select sid from suppiler where sname='"+sname+"'";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                sid=resultSet.getInt("sid");
            }
            else
            {
                // Return 0 for non availability of Department name in the table / Invalid Department Name
                sid=0;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return sid;
    }

    public String getNamebySupplierId(int sid)
    {
        String sname="";
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select sname from suppiler where sid="+sid+"";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                sname=resultSet.getString("sname");
            }
            else
            {
                sname="";
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return sname;
    }
    public ArrayList<String> getSupplierNames()
    {
        ArrayList<String> suppliername=new ArrayList<String>();
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select sname from suppiler order by sname";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            while(resultSet.next())
            {
                suppliername.add(resultSet.getString("sname"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return suppliername;
    }
    public Supplier getSupplierObject(int sid){
        Supplier supplier=null;
        try{
            Statement statement=connection.createStatement();
            String sqlQuery="select * from suppiler where sid="+sid;
            System.out.println(sqlQuery);
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next()){
                supplier=new Supplier();
                supplier.setSid(resultSet.getInt("sid"));
            }
        }
        catch (Exception e){
            System.out.println("Invalid Category Name");
        }
        return supplier;
    }
}
