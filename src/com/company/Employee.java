package com.company;

public class Employee
{
    private int empNumber;
    private String empName;
    private int empSalary;

    public void captureEmployeeInformation(int eno,String ename,int esal)
    {
        empNumber=eno;
        empName=ename;
        empSalary=esal;
    }


    public void showEmployeeInformation()
    {
        System.out.println("Emp Id:"+empNumber+"\nEmp Name:"+empName+"\nEmp Salary:"+empSalary);
    }


    public void increaseSalary(int salIncrease)
    {
        empSalary+=salIncrease;
    }

}
