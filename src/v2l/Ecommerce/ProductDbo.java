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
    public void getProductByCategory(String cname){
        Product product=new Product();
        Category category=new Category();
        Supplier supplier=new Supplier();
        try {
            Statement statement=connection.createStatement();
            String sqlQuery=("select pid,pname,pprice,cname,sname from eproduct INNER JOIN procategory INNER JOIN suppiler ON eproduct.cid=procategory.cid and eproduct.sid=suppiler.sid where cname='"+cname+"'");
            System.out.println(sqlQuery);
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            System.out.println("PID\tPNAME\t\tPPRICE\tCNAME\tSNAME");
            System.out.println("---\t-----\t\t------\t----\t------");
            if(resultSet.next()) {

            product.setpId(resultSet.getInt("pid"));
            product.setPname(resultSet.getString("pname"));
            product.setPprice(resultSet.getInt("pprice"));
            category.setCname(resultSet.getString("cname"));
            supplier.setSname(resultSet.getString("sname"));

                System.out.println(resultSet.getInt("pid"));
                System.out.println(resultSet.getString("pname"));
                System.out.println(resultSet.getInt("pprice"));
                System.out.println(resultSet.getString("cname"));
                System.out.println(resultSet.getString("sname"));
            }
        }
        catch (Exception e){
            System.out.println("Invalid Statement");
        }

    }


}
