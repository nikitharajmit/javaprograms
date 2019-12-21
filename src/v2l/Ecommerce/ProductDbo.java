package v2l.Ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDbo {

    private Connection connection;
    private Statement statement;
    public ProductDbo()
    {
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Learn@v2l");
        }
        catch(Exception e){
            System.out.println("DB Connection Failed!...");
        }
    }
   public int getPriceById(int pid){
        try {
            statement=connection.createStatement();
            String sqlQuery="select pprice from department where pid='"+pid+"'";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                pid=resultSet.getInt("pid");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Statement");
        }
        return pid;
   }
    public int getIdByProductName(String pname){

        int pid=0;
        try {
            statement=connection.createStatement();
            String sqlQuery="select pid from department where pname='"+pname+"'";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                pid=resultSet.getInt("pid");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Statement");
        }
        return pid;
    }
    public String getProductNameById(int pid){
        String pname="";

        try {
            statement=connection.createStatement();
            String sqlQuery="select pname from department where pid="+pid+"";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                pname=resultSet.getString("pname");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Statement");
        }
        return pname;
    }

}
