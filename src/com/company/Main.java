package com.company;

import java.io.DataInputStream;

public class Main {

    public static void main(String[] args)
    {
/*      Employee emp=new Employee();

        emp.captureEmployeeInformation(101,"Kiran",25000);
        emp.showEmployeeInformation();
        emp.increaseSalary(1000);
        emp.showEmployeeInformation();*/

    /*    Student st=new Student();
        st.registerStudent(100,"Kiran","Mysore","a+","Computer Science");
        st.viewStudentDetails();
        st.allocateCourse();
        st.viewStudentDetails();*/

        int a[]=new int[10];
        int sum;
        sum=0;


        DataInputStream in=new DataInputStream((System.in));
        try {
            for (int i = 0; i <= 2; i++) {
                System.out.println("Please enter the value for Index:"+i+":");
                a[i] = Integer.parseInt(in.readLine());
            }
        }
        catch(Exception e)
        {
            // No code
        }

        sum=0;
        for(int i=0;i<=2;i++)
            sum+=a[i];

        System.out.println(sum);




    }
}
