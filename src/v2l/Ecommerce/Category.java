package v2l.Ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Category {
    private Connection connection;
    private Statement statement;
    public Category()
    {
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Learn@v2l");
        }
        catch(Exception e){
            System.out.println("DB Connection Failed!...");
        }
    }
    public ArrayList<String> getCategoryNames()
    {
        ArrayList<String> categotyname=new ArrayList<String>();
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select cname from procategory order by cname";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            while(resultSet.next())
            {
                categotyname.add(resultSet.getString("cname"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return categotyname;
    }
    public int getIdbyCategoryName(String cname)
    {
        int cid=0;
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select cid from procategory where cname='"+cname+"'";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                cid=resultSet.getInt("cid");
            }
            else
            {
                cid=0;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return cid;
    }

    public String getCategoryNamebyId(int cid)
    {
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select cname from procategory where cid="+cid+"";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                System.out.println(resultSet.getString("cname"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
}
