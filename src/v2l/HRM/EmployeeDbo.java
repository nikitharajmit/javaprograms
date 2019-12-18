package v2l.HRM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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


    public boolean updateEmployeeSalary(Employee employee, int newSalary)
    {
        boolean updateStatus=false;
        try {
            statement = connection.createStatement();
            String sqlQuery = "update employee set salary="+newSalary+" where id="+employee.getId();
            System.out.println(sqlQuery);
            int updateRowCount=statement.executeUpdate(sqlQuery);
            if(updateRowCount>0)
                updateStatus=true;
        }
        catch(Exception e)
        {
            System.out.println("Statement creation failed...");
        }
        return updateStatus;
    }

    public boolean updateEmployeeAge(Employee employee,int newAge)
    {
        boolean updateStatus=false;
        try {
            statement = connection.createStatement();
            String sqlQuery = "update employee set age="+newAge+" where id="+employee.getId();
            System.out.println(sqlQuery);
            int updateRowCount=statement.executeUpdate(sqlQuery);
            if(updateRowCount>0)
                updateStatus=true;
        }
        catch(Exception e)
        {
            System.out.println("Statement creation failed...");
        }
        return updateStatus;
    }

    public boolean deleteEmployee(Employee employee)
    {
        boolean deleteStatus=false;
        try {
            statement = connection.createStatement();
            String sqlQuery = "delete from employee where id="+employee.getId();
            System.out.println(sqlQuery);
            int deleteRowCount=statement.executeUpdate(sqlQuery);
            if(deleteRowCount>0)
                deleteStatus=true;
        }
        catch(Exception e)
        {
            System.out.println("Statement creation failed...");
        }
        return deleteStatus;
    }

    public Employee getEmployeeById(int eid)
    {
        Employee employee=null;
        try {
            statement = connection.createStatement();
            String sqlQuery = "select * from employee where id="+eid;
            System.out.println(sqlQuery);
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            if(resultSet.next()) {
                employee=new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("ename"));
                employee.setSalary(resultSet.getInt("salary"));
                employee.setAge(resultSet.getInt("age"));
                employee.setDeptId(resultSet.getInt("did"));
                employee.setDesigId(resultSet.getInt("desid"));
            }

        }
        catch(Exception e)
        {
            System.out.println("Statement creation failed...");
        }

        return employee;
    }

    public ArrayList<Employee> getAllEmployees()
    {
        ArrayList<Employee> employeeArrayList=new ArrayList<Employee>();
        try {
            statement = connection.createStatement();
            String sqlQuery = "select * from employee order by id";
            System.out.println(sqlQuery);
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            while(resultSet.next())
            {
                Employee employee=new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("ename"));
                employee.setSalary(resultSet.getInt("salary"));
                employee.setAge(resultSet.getInt("age"));
                employee.setDeptId(resultSet.getInt("did"));
                employee.setDesigId(resultSet.getInt("desid"));
                employeeArrayList.add(employee);
            }

        }
        catch(Exception e)
        {
            System.out.println("Statement creation failed...");
        }

        return employeeArrayList;
    }

    public ArrayList<Employee> getAllEmployees(int did)
    {
        ArrayList<Employee> employeeArrayList=new ArrayList<Employee>();
        try {
            statement = connection.createStatement();
            String sqlQuery = "select * from employee where did="+did+" order by id";
            System.out.println(sqlQuery);
            ResultSet resultSet=statement.executeQuery(sqlQuery);
            while(resultSet.next())
            {
                Employee employee=new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("ename"));
                employee.setSalary(resultSet.getInt("salary"));
                employee.setAge(resultSet.getInt("age"));
                employee.setDeptId(resultSet.getInt("did"));
                employee.setDesigId(resultSet.getInt("desid"));
                employeeArrayList.add(employee);
            }

        }
        catch(Exception e)
        {
            System.out.println("Statement creation failed...");
        }

        return employeeArrayList;
    }

}
