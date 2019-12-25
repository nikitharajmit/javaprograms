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
    public void insertProduct(PurchaseProduct purchaseProduct){
        try {
            Statement statement=connection.createStatement();
            String sqlQuery="Insert into eproduct values("+purchaseProduct.getpId()+",'"+purchaseProduct.getpName()+"',"+purchaseProduct.getPrice()+","+purchaseProduct.getCid()+")";
            System.out.println(sqlQuery);
            statement.executeUpdate(sqlQuery);
        }
        catch (Exception e){
            System.out.println("Invalid Statement");
        }
    }

}
