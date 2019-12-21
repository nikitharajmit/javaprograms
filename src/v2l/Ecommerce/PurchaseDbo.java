package v2l.Ecommerce;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PurchaseDbo {
    private Connection connection;
    private Statement statement;

    public PurchaseDbo()
    {
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Learn@v2l");
        }
        catch(Exception e){
            System.out.println("DB Connection Failed!...");
        }
    }
    public void insertPurchaseDetails(PurchaseProduct purchase)
    {
        try {
            statement = connection.createStatement();
            String sqlQuery = "Insert into purchase values("+purchase.getPurid()+",'"+purchase.getpname()+"',"+purchase.getSname()+","+purchase.getUsername()+")";
            System.out.println(sqlQuery);
            statement.executeUpdate(sqlQuery);
        }
        catch(Exception e)
        {
            System.out.println("Statement creation failed...");
        }

    }
}
