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


    public ArrayList<String> getDepartmentNamesToChoose()
    {
        DepartmentDbo departmentDbo=new DepartmentDbo();
        return departmentDbo.getDepartmentNames();
    }

    public ArrayList<String> getDesignationNamesToChoose()
    {
        DesignationDbo designationDbo=new DesignationDbo();
        return designationDbo.getDesignationNames();
    }


}
