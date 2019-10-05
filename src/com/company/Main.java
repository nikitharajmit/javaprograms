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

        //Bank details program

     /*   Bank b=new Bank();
        b.bankDetails(1234,"Nikitha",101010, "savings");
        b.showDetails();*/

     //hospital details program

      /*  Hospital h=new Hospital();
        h.patientDetials(10,"Anu","kuvempunagar","o+");
        h.showPatientDetails();*/



    //sum of numbers using arrays and using DataInputStream
        /*int a[]=new int[10];
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

        System.out.println(sum);*/

//program to find largest number

/*        int x[]=new int[10];
        int large=0;

        DataInputStream in=new DataInputStream((System.in));
        try {
            for (int i=0;i<=4;i++){
            System.out.println("Enter the numbers:");
            x[i]=Integer.parseInt(in.readLine());

             }
        }
        catch (Exception e){

        }
            for (int i=0;i<=4;i++)
                if (x[i] > large)
                large = x[i];


System.out.println("Largest Number:"+large);*/



 /*CustomerInBank cust1=new CustomerInBank();
        cust1.bankDetails(101,"Sowmya",12345,"SB");
        cust1.showDetails();*/


        DataInputStream in=new DataInputStream(System.in);

  /*      CustomerInBank cust[]=new CustomerInBank[10];
        for(int i=0;i<1;i++)
            cust[i]=new CustomerInBank();

        for(int i=0;i<1;i++)
        {
         try
         {
             int cusid;
             String custname;
             int accountno;
             String acctype;
             float accbalance;

             System.out.println("Please provde details of a Customer");
             System.out.print("Customer Id: ");
             cusid=Integer.parseInt(in.readLine());

             System.out.print("Customer Name: ");
             custname=in.readLine();

             System.out.print("Account No: ");
             accountno=Integer.parseInt(in.readLine());

             System.out.print("Account Type: ");
             acctype=in.readLine();

             System.out.print("Account Balance: ");
             accbalance=Float.parseFloat(in.readLine());

             cust[i].bankDetails(cusid,custname,accountno,acctype,accbalance);

         }
         catch(Exception e)
         {

         }
        }

        for(int i=0;i<1;i++)
            cust[i].showDetails();


        for (int j=0;j<1;j++)
            cust[j].addInterest();

        for(int i=0;i<1;i++)
            cust[i].showDetails();
*/
        int choice=0;

        do {
            System.out.println("Please select the choice of Operation");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            try
            {
                choice=Integer.parseInt(in.readLine());

                switch(choice)
                {
                    case 1:
                            System.out.println("Withdraw option selected");
                            break;
                    case 2:
                            System.out.println("deposit option selected");
                            break;
                    case 3:
                            System.out.println("Show Balance option selected");
                            break;

                }
            }
            catch (Exception e)
            {

            }


        }while(choice!=4);

    }
}
