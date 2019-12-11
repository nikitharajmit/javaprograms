package v2l.mainfunction;
import java.sql.*;
import java.util.Scanner;

public class DBMain {

    public static void main(String args[])
    {
        try
        {
            Scanner scanner=new Scanner(System.in);
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Learn@v2l");
            Statement statement=connection.createStatement();

            int eid, esalary, eage, deptid, desigid;
            String ename;
            int choice;

            do {

                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Show/Select all records");
                System.out.println("5. Search by Department name");
                System.out.println("6. Exit");
                System.out.print("Please select the operation to be performed on Employee table: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Please give employee details");
                        System.out.print("Employee Id: ");
                        eid = scanner.nextInt();
                        System.out.print("Employee Name: ");
                        ename = scanner.next();
                        System.out.print("Employee Salary: ");
                        esalary = scanner.nextInt();
                        System.out.print("Employee Age: ");
                        eage = scanner.nextInt();
                        System.out.print("Department Name (SALES, PRODUCTION, PURCHASE): ");
                        deptid = getDeptId(scanner.next());
                        System.out.print("Designation Name (DEVELOPER, TESTER, MANAGER): ");
                        desigid = getDesigId(scanner.next());

                        if(deptid==0 || desigid==0)
                            System.out.println("Invalie Depart name or Designation Name. Record cannot be created...");
                        else
                        {
                            String sqlQuery="insert into employee values("+eid+",'"+ename+"',"+eage+","+esalary+","+deptid+","+desigid+")";
                            int rowsaffected=statement.executeUpdate(sqlQuery);
                            System.out.println(rowsaffected+" row(s) inserted successfully | "+sqlQuery);
                        }

                        break;
                    case 2:
                        System.out.println("This operation is not available yet.. coming soon....");
                        break;
                    case 3:
                        System.out.println("This operation is not available yet.. coming soon....");
                        break;
                    case 4:
                        System.out.println("List of Employees available in database");
                        ResultSet resultSet=statement.executeQuery("select id as eid, ename, salary as esalary, age as eage, dname, designationname from employee inner join department inner join designation on employee.did=department.did and employee.desid=designation.desid order by eid");
                        System.out.println("EID\tENAME\t\tESALARY\tEAGE\tDEPTNAME\tDESIGNAME");
                        System.out.println("---\t-----\t\t-------\t----\t------\t--------");
                        while(resultSet.next())
                        {
                            System.out.println(resultSet.getInt("eid")+"\t"+resultSet.getString("ename")+"\t"+resultSet.getInt("esalary")+"\t"+resultSet.getInt("eage")+"\t"+resultSet.getString("dname")+"\t"+resultSet.getString("designationname"));
                        }
                        break;
                    case 5:
                        System.out.println("This operation is not available yet.. coming soon....");
                        break;
                    default:
                        System.out.println("Please select the right operation to be performed on Employee table");
                }

            }while(choice!=6);

            connection.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }

    static int getDeptId(String dname)
    {
        /*2
            Assumptions / Based on initial Data
            DEPARTMENT
            ----------
            SALES - 1
            PRODUCTION  - 2
            PURCHASE - 3

             */

        if (dname.toUpperCase().equals("SALES"))
        {
            return 1;
        }
        else if (dname.toUpperCase().equals("PRODUCTION"))
        {
            return 2;
        }
        else if (dname.toUpperCase().equals("PURCHASE"))
        {
            return 3;
        }

        return 0;
    }

    static int getDesigId(String designation)
    {
        /*
            Assumptions / Based on initial Data
            DESIGNATION
            -----------
            DEVELOPER - 111
            TESTER - 222
            MANAGER - 333
             */

        if (designation.toUpperCase().equals("DEVELOPER"))
        {
            return 111;
        }
        else if (designation.toUpperCase().equals("TESTER"))
        {
            return 222;
        }
        else if (designation.toUpperCase().equals("MANAGER"))
        {
            return 333;
        }

        return 0;

    }
}
