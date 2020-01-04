package v2l.Ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PDiscountDbo {
    private Connection connection;
    private Statement statement;

    public PDiscountDbo() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Learn@v2l");
        } catch (Exception e) {
            System.out.println("DB Connection Failed!...");
        }
    }

    public String getMonthByid(int pDisid) {
        try {
            statement = connection.createStatement();
            String sqlQuery = "select month from pdiscount where pDisid=" + pDisid + "";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            if (resultSet.next()) {
                System.out.println(resultSet.getString("month"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public int getdisINRByMonth(String month) {
        int disINR=0;
        try {
            statement = connection.createStatement();
            String sqlQuery = "select disINR from pdiscount where month='" + month + "'";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            if (resultSet.next()) {
                disINR=resultSet.getInt("disINR");
                return disINR;
            }
        } catch (Exception e) {
            System.out.println("Invalid Month..Please Check");
        }
        return disINR;
    }
}
