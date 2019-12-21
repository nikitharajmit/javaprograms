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
            String sqlQuery="select cname from prodiscount order by cname";
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
}
