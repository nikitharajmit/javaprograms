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
