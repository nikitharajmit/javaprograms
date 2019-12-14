package v2l.HRM;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DepartmentDbo
{
    private Connection connection;
    private Statement statement;

    public DepartmentDbo()
    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Learn@v2l");
        }
        catch(Exception e)
        {
            System.out.println("DB Connection Failed!...");
        }
    }

    public ArrayList<String> getDepartmentNames()
    {
        ArrayList<String> departmentName=new ArrayList<String>();
        try
        {
        statement=connection.createStatement();
        String sqlQuery="select dname from department order by dname";
        ResultSet resultSet=statement.executeQuery(sqlQuery);
        while(resultSet.next())
        {
            departmentName.add(resultSet.getString("dname"));
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return departmentName;
    }

    public int getIdbyDepartmentName(String dname)
    {
        int did=0;
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select did from department where dname='"+dname+"'";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                did=resultSet.getInt("did");
            }
            else
            {
                // Return 0 for non availability of Department name in the table / Invalid Department Name
                did=0;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return did;
    }

    public String getNamebyDepartmentId(int did)
    {
        String dname="";
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select dname from department where did="+did+"";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                dname=resultSet.getString("dname");
            }
            else
            {
                // Return 0 for non availability of Department name in the table / Invalid Department Name
                dname="";
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return dname;
    }
}
