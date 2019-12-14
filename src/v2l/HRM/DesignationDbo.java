package v2l.HRM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DesignationDbo
{
    private Connection connection;
    private Statement statement;

    public DesignationDbo()
    {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Learn@v2l");
        }
        catch(Exception e)
        {
            System.out.println("DB Connection Failed!...");
        }
    }

    public ArrayList<String> getDesignationNames()
    {
        ArrayList<String> designationName=new ArrayList<String>();
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select designationname from designation order by designationname";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            while(resultSet.next())
            {
                designationName.add(resultSet.getString("designationname"));
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return designationName;
    }

    public int getIdbyDesignationName(String desname)
    {
        int desid=0;
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select desid from designation where designationname='"+desname+"'";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                desid=resultSet.getInt("desid");
            }
            else
            {
                // Return 0 for non availability of Designation name in the table / Invalid Designation Name
                desid=0;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return desid;
    }

    public String getNamebyDesignationId(int desid)
    {
        String desname="";
        try
        {
            statement=connection.createStatement();
            String sqlQuery="select designationname from designation where desid="+desid+"";
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next())
            {
                desname=resultSet.getString("designationname");
            }
            else
            {
                // Return 0 for non availability of Designation name in the table / Invalid Designation Name
                desname="";
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return desname;
    }
}