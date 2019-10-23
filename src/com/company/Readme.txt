Last
----
0. Data Types - Int, float, char, double, boolean

1. Control statement
	- Branching
	- Looping
2. Class and Objects

Class - Definition

Object - Instance / Memory blocks


Syntax

<Access specifier> Class <classname>
{
<Access Specifier> <data type> <property name>;
.
.
.
.
.

<Access Specifier> <data type> <Method/Function/Behavior>(<Arguments list>)
{
.
.
.
.
.
}
.
.
.
.
.
}

Access Specifiers
1. private (Default)
2. public

Data type
int
float
double
char
String -> Class
boolean

Car and Bike manufacturing
--------------------------

COMMON Classes - vehiclemanufacturing
	Wheels
	Engine

CAR Package - carmanufacturing
	CarBody
	Winshield
	Steering
	Windows
	vehiclemanifacturing.Wheels

BIKE Package - bikemanufacturing
	Handle
	vehiclemanifacturing.Wheels


Object creation - Class Instantiation
-------------------------------------

<Class Name> <Object Name>=new <Class Name>();
Employee e=new Employee();


e.g.
Class Point
{
	int x; - 32B
	int y; - 32B
}

Point p=new Point()

Memory size/allocation -> sum of memory required for all the properties defined in the class


Arrays
------
int a,b,c,d,e,f,g,h,j,i;

<data type> <variablename>[]=new <datatype>[<Size>];

<variable name>[<Positon/Index>]

int a[]=new int[10];

a[0]
a[1]
a[2]
a[3]

IO operations
-------------
Out
In

DataInputStream

DataInputStream in=new DataInputStream(System.in);

String in.read();
String in.readLine()

Conversion of datatypes -> Type Casting / Parse

JAVA
----
Wrapper Classes -> These are classes which are created to provide additional features/operations on Default Data types

Integer.parseInt(<String>);

Assignments
------------
1. Create a class to capture Customer information for a Bank. Allow customer to perform Withdraw and Deposit for the given account number

Constructors Function/Method
----------------------------
-> Method which executed as soon as the memory is allocated for the properties of the Class
-> Constructor should have same name as Class Name

Class BankCustomer
{
    private int accountNo;
    private int initialBalance;
    private String custName;

    public void input(int acno, String cname)
        {
        //Code goes here

        }

    public void output()
        {
        //Code goes here

        }

//Constructor
    public BankCustomer()
    {
    //Constructor code goes here
    }
}





Main()
{
BankCustomer cust1=new BankCustomer();

<Init>

cust1.accountNo=NotInitialized
cust1.initialBalance=NotInitialized
cust1.custName=""

}

// Function Overloading / Polymorphism

<Parameters of the function | No. of Paremeters and its Type> -> Function Signature
Multiple function definitions having same name with different signature


int a,b,c;
void add(int x, int y)
{
    int c;
    c=x+y;
    System.out.println(c);
}

void add(int x, int y,int z)
{
    int c;
    c=x+y+z;
    System.out.println(c);
}

void add(int x, int y,int z,int p)
{
    int c;
    c=x+y+z+p;
    System.out.println(c);
}


add(2,3)

add(4,2,3);

add(56,56,43,23)

Function
--------
1. Parameters / Arguments
2. Return types

<Access Specifier> <Return Type> <Function Name>(<Parameters>)
{
//Logic

if <Return Type> != "void"
    return <return Type Value>

}

Self referencing pointer in a Class - 'this'
-------------------------------------------

Assignments
------------
1. Create a class to capture Customer information for a Bank. Allow customer to perform Withdraw and Deposit for the given account number

// Access control
a. Static
b. final


Static
1. Static Variable/properties
2. Static Methods
3. Static Code Blocks

1. Static Variable

e.g.

class Employee
{
    private int id;
    private String name;
    private int sal;
    public static int companyCode;

    public void inputEmployeeDetails(int id, String name, int sal)
    {
        .
        .
        .
    }

    public void showEmployeeDetails()
    {
        print
            id
            name
            sal
            companyCode
    }
}

Employee e1=new Employee();
Employee e2=new Employee();

e1.companyCode=1101;

e2.inputEmployeeDetails(102,"Ramesh",34000);
e2.showEmployeeDetails();

Output:
102
Ramesh
34000
1101


Static Method
-------------
class Employee
{
    private int id;
    private String name;
    private int sal;
    public static int companyCode;


    public static void showResponsibilities(String role)
    {
        .
        .
        .
        .
    }

    public void inputEmployeeDetails(int id, String name, int sal)
    {
        .
        .
        .
    }

    public void showEmployeeDetails()
    {
        print
            id
            name
            sal
            companyCode
    }
}


Employee.showResponsibility("PM");

Static Block
------------
Static Method
-------------
class Employee
{
    private int id;
    private String name;
    private int sal;
    public static int companyCode;

    static
    {
        companyCode=1101;
    }

    public static void showResponsibilities(String role)
    {
        .
        .
        .
        .
    }

    public void inputEmployeeDetails(int id, String name, int sal)
    {
        .
        .
        .
    }

    public void showEmployeeDetails()
    {
        print
            id
            name
            sal
            companyCode
    }
}



Syntax

Static Variable

<Access modifier> static <data type> <variables>;

Static method

<Access modifier> static <return type> <function name>(<Argument list>)
{
.
.
.
}

Static block

static
{
.
.
.
}


final
-----
define a constant

syntax

<access modifier> final <data type> <variable name>=<value>;

// Design a class to manage the inventory of books in a Library. Use Static and Final where applicable


Assignment
-----------
1. Create a Class to capture Book details with its purchased and available quantity for a Library.
    a. Add 5 different books into Library
    b. Accept the transaction type from the user
        a. if Issue, accept Booktitle and issue qty from the user and perform issue operation and show the remaining qty of books
        b. if Return, accept Booktitle and return qty from the user and perform issue operation and show the remaining qty of books

Inheritance
-----------
Base class - Super Class
Derived class


Syntax

<access modifier> class <class name> extends <super class name>

super -> keyword. this will always refer to immediate base class/ super class

// e.g. Create classes to capture CAR variants and its properties

Car variants
------------
Sedan
Hatchback

Sedan
-----
properties

1. wheels *
2. engine *
3. steering *
4. length

behavior
1. Speed
2. Boot space management


Hatchback
---------
properties

1. wheels *
2. engine *
3. steering *
4. length

behavior

1. Speed
2. Boot space management


with Inheritance

CAR
---
properties
1. wheels
2. engine
3. steering

behavior
--------
1. Speed



Sedan derives from CAR
----------------------
properties
1. length

behavior

1. Speed
2. Boot space management


Hatchback derives from CAR
--------------------------
properties
1. length

behavior
1. Speed
2. Boot space management

Inheritance
------------
1. Single Inheritance - Supported in JAVA
2. Multi-level Inheritance - Supported in JAVA
3. Multiple Inheritance - Not Supported in JAVA


Function Overloading/Polymorphism -> Having same function name with different signatures (argument types and no. of arguments)

Function Overriding -> Having same function name with same signatures in Super and Derived Class (argument types and no. of arguments)


Access modifier
---------------
Private
Public
Protected -> This is applicable only for Super and Derived Class

Problem Statement
-----------------
1. Capture voter details for a general election which is scheduled to be conducted in Mysore.
Provide the below features in the design
    a. Add Voter
    b. Modify Voter details based on VoterID
    c. List all Voters


Approach
1. List down all the data that needs to be captured
2. Group the related data - as much as possible
3. Identify the relation between the data listed
4. Identify repeated data and operations in Groups/By feature

Objects as Properties of a Class with Arrays

Problem Statement
-----------------
1. Capture Product details of the supplier and allow purchasers to choose the product and purchase
-> Capture Product details
-> Show Product to purchasers
-> Allow Purchase operation

1. Product Code
2. Product Title
3. Product Desc
4. Product Price
5. Product Seller name
6. Customer name
7. Customer Address
8. Customer Payment Details


Product
- Code
- Title
- Desc
- Price
- Supplier Name
- TurnAroundTimeInDays

Customer
- Name
- Address


Customer_Payment
- Product
- Customer
- Purchase date
- Purchase Qty
- Purchase Price
- Estimated Delivery in days

Implementation - Main Function
Customer_Payment[10]


Assignment
----------
Extend the Product purchase program defined already to provide below options to user
1. Create Product
2. Create Customer
3. Show Product to purchase
    -> Accept Product Id for purchase transaction
    -> Accept Customer Name
    -> Accept Qty to be purchased
    -> Accept the Purchase Date
    -> Show Purchase Transaction details with Total Amount to be Paid and also the TAT





