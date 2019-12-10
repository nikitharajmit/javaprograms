package v2l.mainfunction;
import java.sql.*;

public class DBMain {

    public static void main(String args[])
    {
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Learn@v2l");
            Statement statement=connection.createStatement();
            int rowsaffected=statement.executeUpdate("insert into employee values(109,'Varalakshmi',25,65000,2,222)");
            System.out.println(rowsaffected+" row(s) inserted successfully");
            connection.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}
