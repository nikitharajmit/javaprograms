package com.company;

import javax.naming.directory.SearchResult;
import java.io.DataInputStream;
import java.util.Scanner;

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

/*Voter v1=new Voter();
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
    System.out.println("Voter is not Eligible");*/

  /*  CustomerTranscation customerTranscation[]=new CustomerTranscation[10];
    Product product[]=new Product[5];
    Customer customer[]=new Customer[5];

    product[0]=new Product();
    product[0].createProduct(1,"Mobile","One Plus Mobile with 6 inch display",20000,"Sangeetha Mobiles",10);

    product[1]=new Product();
    product[1].createProduct(2,"Smart Band","Honor 5 with Blood Oxygen display",5000,"Universal",4);

    customer[0]=new Customer();
    customer[0].createCustomer("Nikitha","Mysore");

    customerTranscation[0]=new CustomerTranscation();
    customerTranscation[0].purchase(product[0],customer[0],"Oct-2019",2);

    customerTranscation[1]=new CustomerTranscation();
    customerTranscation[1].purchase(product[1],customer[0],"Oct-2019",1);

    customerTranscation[0].showPurchaseDetails();
    customerTranscation[1].showPurchaseDetails();*/

/*    University university=new University();
    university.createCollegeDetails("MH0006","MIT","Mandya");
    university.createCollegeDetails("JC0001","JCE","Mysore");
    university.createCollegeDetails("PES008","PES","Mandya");
    university.createCollegeDetails("ATME02","ATME","Mysore");
    university.createCollegeDetails("MR0009","MRIT","Mandya");


  College c1,c2;
  c1=university.getCollegeName("MIT");
  c2=university.getCollegeName("JCE");

        c1.createStudentDetails(101,"Nikitha","Mysore");
        c1.createStudentDetails(102,"Anusha","Mandya");
        c1.createStudentDetails(103,"Anitha","Maddur");
        c1.createStudentDetails(104,"Sahana","Mysore");
        c1.createStudentDetails(105,"Amulya","Mysore");

        c2.createStudentDetails(201,"Bindu","Mangalore");
        c2.createStudentDetails(202,"Anand","Mangalore");
        c2.createStudentDetails(203,"Vinuth","Mangalore");
        c2.createStudentDetails(204,"Lakshmi","Mangalore");
        c2.createStudentDetails(205,"Raju","Mangalore");

        System.out.println("MIT Students");
        c1.showStudentDetails();
        System.out.println("JC Students");
        c2.showStudentDetails();*/

/*    Bank bank=new Bank("HDFC",65);
    bank.showAccountBalance();
    bank.bankTransaction.deposit(3000);
    bank.showAccountBalance();
    if(!bank.bankTransaction.withdraw(3000))
        System.out.println("Your account balance will be less than Minimum with this transaction. Hence not permitted!");
    else
        bank.showAccountBalance();
        */

       /*String names[]=new String[10];


    // Initialization
    names[0]="Mysore";
    names[1]="Bangalore";
    names[2]="Mangalore";
    names[3]="Bidar";
    names[4]="Hassan";
    names[5]="Shimogga";
    names[6]="Davangere";
    names[7]="Chamarajanagar";
    names[8]="Raichur";
    names[9]="Chikkamagalur";

    //or this can be accepted by users also
    *//*    for(int i=0;i<10;i++)
            names[i]=Integer.parseInt(in.readLine());*//*

    String searchKey;
    Scanner scanner=new Scanner(System.in);
    searchKey=scanner.next();

    boolean searchResult;

    searchResult=false;
    String searchStringResult="";
    for(int i=0;i<10;i++)
        if(searchKey.equals(names[i])) {
            searchResult = true;
            searchStringResult=names[i];
        }

        if(searchResult)
            System.out.println("Search Success!" + searchStringResult);
        else
            System.out.println("Search Failure!");*/

/*VoterInformation voter=new VoterInformation();
voter.setVoterinfo(2020,1020,"3rd cross","JP Nagar");
voter.showVoterinfo();
voter.e.setAge(20);
if(voter.e.iseligible())
    System.out.println("Eligible");
else
    System.out.println("Not Eligible");*/


/*AnimalSound animalSound;

Dog dog=new Dog();
Cat cat=new Cat();


        animalSound=dog;
        animalSound.makeASound();
if(dog.hasTail())
    System.out.println("Dog has a tail");


        animalSound=cat;
        animalSound.makeASound();*/

/*
HouseConstruction home=new HouseConstruction();

home.installEnergyMeter();
home.leaveSetBacks(30,40);
*/

/*LIBLibrarian libLibrarian=new LIBLibrarian();
LIBStudent libStudent=new LIBStudent();

LIBTransaction libTransaction;

showTransactionOfALibrary(libLibrarian);
showTransactionOfALibrary(libStudent);*/

/*InterfaceDemo interfaceDemo=new InterfaceDemo();
interfaceDemo.followSignals();*/

/*DrivingRules.showFineFor(DrivingRules.VIOLATIONSG);*/

/*System.out.println(interfaceDemo.getNoOfConstants());*/
/*System.out.println("Fine for Overspeeding:"+interfaceDemo.calculateFine(DrivingRules.VIOLATIONOS));
System.out.println("Fine for Signal Jump:"+interfaceDemo.calculateFine(DrivingRules.VIOLATIONSG));*/

/*
ECProduct p1=new ECProduct("Mobile - iPHONE",50000);
ECProduct p2=new ECProduct("Mobile - VIVO",500);

p1.applyDiscount(Discount.JAN);
p1.showProductDetails();

p2.applyDiscount(Discount.FEB);
p2.showProductDetails();

*/

// Assume a scenario where %result to be calculated for the given student with Total marks and obtained marks
// Total marks=600
// Student 1: 560
// Student 2: 300
// Student 3: 0

/*float total_marks, obtained_marks,percentage;

total_marks=600;
obtained_marks=560;
percentage=0;

try
{
    percentage = obtained_marks / total_marks * 100;
}
catch(ArithmeticException ex)
{
    System.out.println("Please check if your Total Marks is 0");
}

System.out.println("Percentage="+percentage+"%");*/

/*int a[]=new int[5];
int max;

for(int i=0;i<5;i++)
    a[i]=i*10;

max=6;

//try {
    for (int i = 0; i < max; i++)
        System.out.println(a[i]);*/
//}
/*catch(ArrayIndexOutOfBoundsException ex)
{
    System.out.println(ex);
}*/

/*System.out.println("This is after Exception handled");*/

/*        for(int i=0;i<5;i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println("");
        }*/

   /* try
    {
        EmployeeExceptionDemo();
    }
    catch(Exception ex)
    {
        System.out.println(ex);

    }*/

 /*   Bank bank=new Bank("HDFC",65);
    try {
        bank.bankTransaction.withdraw(2000);
        bank.showAccountBalance();
        bank.bankTransaction.withdraw(3000);
        bank.showAccountBalance();
        bank.bankTransaction.withdraw(300);
    }
    catch(InsufficientBalanceException ex)
    {
        ex.printStackTrace();
    }*/

    PurchaseProductDetails p1=new PurchaseProductDetails();
    p1.setProductDetails("P001","TV",24000,"entertainment","Shubham");
    p1.setProductDetails("P002","Mobile",14000,"entertainment","Sangeetha");
        p1.setProductDetails("P003","Fastrack",4000,"watch","Fastrack");






    }

    /*public static void EmployeeExceptionDemo() throws SalaryIncrementExceededException
    {
        Employee employee=new Employee();
        employee.captureEmployeeInformation(101,"Kiran",25000);
        employee.showEmployeeInformation();
        try {
            employee.increaseSalary(6000);
        }
        catch(SalaryIncrementExceededException ex)
        {
            throw ex;

        }
        employee.showEmployeeInformation();
    }*/

    /*public static void showTransactionOfALibrary(LIBTransaction libTransaction)
    {
        libTransaction.bookIssue();
        libTransaction.bookReturn();
    }
*/
}
