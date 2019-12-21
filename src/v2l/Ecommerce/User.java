package v2l.Ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    private Connection connection;
    private Statement statement;
    public User()
    {
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Learn@v2l");
        }
        catch(Exception e){
            System.out.println("DB Connection Failed!...");
        }
    }

    public int getIdbyUserName(String username)
    {
        int uid=0;
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select uid from userregistration where username='"+username+"'";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                uid=resultSet.getInt("uid");
            }
            else
            {
                uid=0;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return uid;
    }

}
