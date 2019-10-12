package com.company;

public class ITEmployee {

    private int id;
    private String name;
    private int sal;
    public static int companyCode;
    public final String COMPANY_NAME="V2LEARN";

    static
    {
        companyCode=1101;
    }

    public static void showResponsibilities(String role)
    {
        if(role.equals("PM"))
        {
            System.out.println("Project Manager Role");
        }
        else if(role.equals("TL"))
        {
            System.out.println("Team Lead Role");
        }
        else
        {
            System.out.println("Other Role");
        }

    }

    public void inputEmployeeDetails(int id, String name, int sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    public void showEmployeeDetails()
    {
        System.out.println("ID="+id);
        System.out.println("NAME="+name);
        System.out.println("SAL="+sal);
        System.out.println("C-CODE="+companyCode);
    }
}
