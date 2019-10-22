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


/*        DataInputStream in=new DataInputStream(System.in);

        CustomerInBank cust[]=new CustomerInBank[10];
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


        }while(choice!=4);*/

//bank program using constructor, functions, polymorphism
       /* BankCustomer customer1=new BankCustomer();
        System.out.println("Without Explicit Initial Balance");
        customer1.input(101,"Kiran");
        customer1.output();


        BankCustomer customer2=new BankCustomer(50000);
        System.out.println("With Explicit Initial Balance");
        customer2.input(101,"Ramesh");

        String custDetails;
        custDetails=customer2.getCustomerDetails();
         System.out.println(custDetails);*/

       //student details program

/*        Student student1= new Student();
        student1.registerStudent(101,"Nikitha","Kuvempunagar","o+","Electricals");
        student1.showStudentdetails();

        *//*String studentDetails;
        studentDetails= student1.getStudentdetails();
        System.out.println(studentDetails);*//*

        System.out.println( student1.getStudentdetails());*/
/*
        ITEmployee e1=new ITEmployee();
        ITEmployee e2=new ITEmployee();
        ITEmployee e3=new ITEmployee();

        e1.inputEmployeeDetails(101,"Kiran",25000);
        e2.inputEmployeeDetails(102,"Ramesh",35000);
        e3.inputEmployeeDetails(103,"Suresh",45000);

        e1.showEmployeeDetails();

        ITEmployee.companyCode=2202;

        ITEmployee.showResponsibilities("PM");

        e1.showEmployeeDetails();
        e2.showEmployeeDetails();
        e3.showEmployeeDetails();


        System.out.println(e1.COMPANY_NAME);*/

     /*   Book b1[]=new Book[10];

        for (int i=0;i<=1;i++){
            b1[i]=new Book();
        }*/

    /* Book b1=new Book();
     Book b2=new Book();

     b1.BookDetails("JAVA Complete Referrence","Herbert Schildt",700,"Seventh Edition");
     b2.BookDetails("JAVA Referrence","Herbert",800,"Eleventh Edition");

     String book1,book2;
   book1= b1.showBookDetails();
    book2=b2.showBookDetails();

    System.out.println(book1+ "\n "+ book2);*/

/*
BookInventory b=new BookInventory();

b.inputBookDetails(100,"C-Programming","YK","2019",10);
System.out.println(b.getBookDetails());

b.issueBook(10);
System.out.println(b.getBookDetails());

b.issueBook(5);
System.out.println(b.getBookDetails());

b.returnBook(3);
System.out.println(b.getBookDetails());
*/

/*    Sedan verna=new Sedan();
    verna.inputCarProperties(4,true,"CRDI");
    verna.showCarProperties();*/

Voter v1=new Voter();
Voter v2=new Voter();

v1.registerVoterDetails(101,"3rd Cross","Kuvempunagar","570023",26,5555);
v2.registerVoterDetails(457,"11th Cross","K R Mohalla","570004",19,8799);

if (v1.isEligible())
    v1.displayVoterDetails();
else
    System.out.println("Voter is not Eligible");


if (v2.isEligible())
    v2.displayVoterDetails();
else
    System.out.println("Voter is not Eligible");

    }
}
