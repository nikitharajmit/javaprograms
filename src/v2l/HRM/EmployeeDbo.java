package v2l.HRM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeDbo
{
    private Connection connection;
    private Statement statement;

    public EmployeeDbo()
    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Learn@v2l");
        }
        catch(Exception e)
        {
            System.out.println("DB Connection Failed!...");
        }
    }

    public void insertEmployee(Employee employee)
    {
        try {
            statement = connection.createStatement();
            String sqlQuery = "Insert into Employee values("+employee.getId()+",'"+employee.getName()+"',"+employee.getAge()+","+employee.getSalary()+","+employee.getDeptId()+","+employee.getDesigId()+")";
            System.out.println(sqlQuery);
            statement.executeUpdate(sqlQuery);
        }
        catch(Exception e)
        {
            System.out.println("Statement creation failed...");
        }

    }






}
