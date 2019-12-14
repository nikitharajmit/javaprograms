package v2l.mainfunction;

import v2l.HRM.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class DBOMain
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int id, salary, age;
        String name, dname, designame;

        Employee employee=new Employee();

        System.out.println("Please provide details of an Employee to be added");
        System.out.println("Please give employee details");
        System.out.print("Employee Id: ");
        id = scanner.nextInt();
        System.out.print("Employee Name: ");
        name = scanner.next();
        System.out.print("Employee Salary: ");
        salary = scanner.nextInt();
        System.out.print("Employee Age: ");
        age = scanner.nextInt();

        System.out.println("Please select the department names from the list below");
        ArrayList<String> deapartmentNames=employee.getDepartmentNamesToChoose();
        for(int i=0;i<deapartmentNames.size();i++)
            System.out.println(deapartmentNames.get(i));
        dname = scanner.next();

        System.out.println("Please select the designation names from the list below");
        ArrayList<String> designationNames=employee.getDesignationNamesToChoose();
        for(int i=0;i<designationNames.size();i++)
            System.out.println(designationNames.get(i));
        designame = scanner.next();

        if(!employee.createEmployee(id,name,salary,age,dname,designame))
        {
            System.out.println("Error in data.. please check...");
        }
        else
        {
            System.out.println("Employee record created successfully...");
        }

    }
}
