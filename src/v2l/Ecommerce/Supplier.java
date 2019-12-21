package v2l.Ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Supplier {
    private Connection connection;
    private Statement statement;
    public Supplier()
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
            String sqlQuery="select sname from department where sid="+sid+"";
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
}
