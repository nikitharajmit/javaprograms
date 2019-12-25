package v2l.mainfunction;

import v2l.Ecommerce.PurchaseProduct;
import v2l.HRM.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class DBOMain
{
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        int id, salary, age;
        String name, dname, designame;

        Employee employee = null;

        int choiceOfOperation;

        do {
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Show/Select all records");
            System.out.println("5. Search by Department name");
            System.out.println("6. Exit");
            System.out.print("Please select the operation to be performed on Employee table: ");
            choiceOfOperation = scanner.nextInt();
            switch (choiceOfOperation) {
                case 1:
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
                    ArrayList<String> deapartmentNames = Employee.getDepartmentNamesToChoose();
                    for (int i = 0; i < deapartmentNames.size(); i++)
                        System.out.println(deapartmentNames.get(i));
                    dname = scanner.next();

                    System.out.println("Please select the designation names from the list below");
                    ArrayList<String> designationNames = Employee.getDesignationNamesToChoose();
                    for (int i = 0; i < designationNames.size(); i++)
                        System.out.println(designationNames.get(i));
                    designame = scanner.next();

                    employee=new Employee();

                    if (!employee.createEmployee(id, name, salary, age, dname, designame)) {
                        System.out.println("Error in data.. please check...");
                    } else {
                        System.out.println("Employee record created successfully...");
                    }
                    break;
                case 2:
                    System.out.println("Please provide id of an Employee to be update");
                    System.out.print("Employee Id: ");
                    id = scanner.nextInt();

                    employee = Employee.getEmployeeObjectById(id);
                    if (employee == null)
                        System.out.println("Invalid Employee Id");
                    else {
                        System.out.println("Please choose the field to update\n1. Salary\n2. Age");
                        System.out.print("Choice: ");
                        int choice = scanner.nextInt();


                        if (choice == 1) {
                            System.out.println("Current Salary: " + employee.getSalary());
                            System.out.print("Please provide new Salary: ");
                            salary = scanner.nextInt();
                            if (employee.updateSalary(salary))
                                System.out.println("Salary update successful...");
                            else
                                System.out.println("Salary update failure...");
                        } else if (choice == 2) {
                            System.out.println("Current Age: " + employee.getAge());
                            System.out.print("Please provide new Age: ");
                            age = scanner.nextInt();
                            if (employee.updateAge(age))
                                System.out.println("Salary update successful...");
                            else
                                System.out.println("Salary update failure...");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Please provide id of an Employee to be delete");
                    System.out.print("Employee Id: ");
                    id = scanner.nextInt();

                    employee = Employee.getEmployeeObjectById(id);
                    if (employee == null)
                        System.out.println("Invalid Employee Id");
                    else {
                        System.out.print("Are you sure you want to delete Employee ID: " + employee.getId() + "| Employee Name:" + employee.getName() + " (Y/N): ");
                        String choice = scanner.next();
                        if (choice.equalsIgnoreCase("y")) {
                            employee.deleteRecord();
                            System.out.println("Employee record deleted successfully.....");
                        }
                    }
                    break;
                case 4:
                    ArrayList<Employee> employeeArrayList = Employee.getAllEmployees();

                    System.out.println("List of Employees in the Organiation");
                    for (int i = 0; i < employeeArrayList.size(); i++) {
                        Employee employeeObj = employeeArrayList.get(i);
                        System.out.println(employeeObj.getId() + "|" + employeeObj.getName() + "|" + employeeObj.getSalary() + "|" + employeeObj.getAge() + "|" + employeeObj.getDname() + "|" + employeeObj.getDesigname());
                    }
                    break;
                case 5:
                    System.out.println("Please select the department name for which employees to be listed");
                    ArrayList<String> departmentNames=new ArrayList<String>();
                    Employee employee1=new Employee();
                    deapartmentNames=employee1.getDepartmentNamesToChoose();

                    String dnametoSearch;
                    for (int i = 0; i < deapartmentNames.size(); i++)
                        System.out.println(deapartmentNames.get(i));
                    dnametoSearch = scanner.next();

                    ArrayList<Employee> employeeArrayListByDname = Employee.getAllEmployees(dnametoSearch);

                    System.out.println("List of Employees in the Organiation");
                    for (int i = 0; i < employeeArrayListByDname.size(); i++) {
                        Employee employeeObj = employeeArrayListByDname.get(i);
                        System.out.println(employeeObj.getId() + "|" + employeeObj.getName() + "|" + employeeObj.getSalary() + "|" + employeeObj.getAge() + "|" + employeeObj.getDname() + "|" + employeeObj.getDesigname());
                    }

                    break;
                case 6:
                    break;
                default:
                    System.out.println("Invalid Choice!....");
            }
        }while(choiceOfOperation!=6);
    }
}
