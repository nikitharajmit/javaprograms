package v2l.HRM;

import java.time.temporal.ValueRange;
import java.util.ArrayList;

public class Employee
{
    private int id;
    private String name;
    private int salary;
    private int age;
    private String dname;
    private String designame;


    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public int getSalary()
    {
        return this.salary;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getDname(){return dname;}

    public String getDesigname(){return designame;}


    public int getDeptId()
    {
        DepartmentDbo deptdbo=new DepartmentDbo();
        return deptdbo.getIdbyDepartmentName(this.dname);
    }

    public int getDesigId()
    {
        DesignationDbo designationDbo=new DesignationDbo();
        return designationDbo.getIdbyDesignationName(this.designame);
    }

    public void setId(int eid)
    {
        this.id=eid;
    }

    public void setName(String ename)
    {
        this.name=ename;
    }

    public void setSalary(int esalary)
    {
        this.salary=esalary;
    }

    public void setAge(int eage)
    {
        this.age=eage;
    }

    public void setDeptId(int deptId)
    {
        DepartmentDbo deptdbo=new DepartmentDbo();
        dname= deptdbo.getNamebyDepartmentId(deptId);
    }

    public void setDesigId(int desigId)
    {
        DesignationDbo designationDbo=new DesignationDbo();
        designame= designationDbo.getNamebyDesignationId(desigId);
    }

    public boolean createEmployee(int id, String name, int salary, int age, String dname, String designame)
    {
        boolean validData=true;

        this.id=id;
        this.name=name;
        this.salary=salary;
        this.age=age;

        DepartmentDbo departmentDbo=new DepartmentDbo();
        if(departmentDbo.getIdbyDepartmentName(dname)==0)
            validData=false;
        else
            this.dname=dname;

        DesignationDbo designationDbo=new DesignationDbo();
        if(designationDbo.getIdbyDesignationName(designame)==0)
            validData=false;
        else
            this.designame=designame;

        if(validData) {
            EmployeeDbo employeeDbo = new EmployeeDbo();
            employeeDbo.insertEmployee(this);
        }

        return validData;
    }


    public boolean updateSalary(int newSalary)
    {
        EmployeeDbo employeeDbo=new EmployeeDbo();
        return employeeDbo.updateEmployeeSalary(this,newSalary);
    }

    public boolean updateAge(int newAge)
    {
        EmployeeDbo employeeDbo=new EmployeeDbo();
        return employeeDbo.updateEmployeeAge(this,newAge);
    }

    public boolean deleteRecord()
    {
        EmployeeDbo employeeDbo=new EmployeeDbo();
        return employeeDbo.deleteEmployee(this);
    }
    public static ArrayList<String> getDepartmentNamesToChoose()
    {
        DepartmentDbo departmentDbo=new DepartmentDbo();
        return departmentDbo.getDepartmentNames();
    }

    public static  ArrayList<String> getDesignationNamesToChoose()
    {
        DesignationDbo designationDbo=new DesignationDbo();
        return designationDbo.getDesignationNames();
    }

    public static Employee getEmployeeObjectById(int eid)
    {
        EmployeeDbo employeeDbo=new EmployeeDbo();
        return employeeDbo.getEmployeeById(eid);
    }

    public static ArrayList<Employee> getAllEmployees()
    {
        EmployeeDbo employeeDbo=new EmployeeDbo();
        return employeeDbo.getAllEmployees();
    }

    public static ArrayList<Employee> getAllEmployees(String dname)
    {
        EmployeeDbo employeeDbo=new EmployeeDbo();
        DepartmentDbo departmentDbo=new DepartmentDbo();
        return employeeDbo.getAllEmployees(departmentDbo.getIdbyDepartmentName(dname));
    }


}
