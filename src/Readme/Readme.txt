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



Assignment
----------
Create a Class for capturing Student information in a college and display the same.
Assume an University having 5 colleges and each college with Max of 15 students registrations

//Inner and Nested Classes

similar to concept of nested loop

class university
{
college[]
}

class college
{
student[]
}

class student
{
}


as inner class

class university
{
    class college
    {
        class student
        {
        }
        student[] - Correct
    }
    student[] - Wrong
}

main()
{
university[] -correct
college[] - wrong
student[] - wrong
}

// INNER CLASS / NESTED CLASS
// Create a class for handling bank transaction such as Withdraw and Deposit
- assume a bank account with minimum balance of 25000

// Abstract Class

OOPS
1. Data Abstraction
2. Data Encapsulation
3. Inheritance
4. Polymorphism


Class Animal
{
    makeASound()
    {
        "Dont know"
    }
}

class Dog extends Animal
{
    makeASound()
    {
        "Bow Bow"
    }
}

class Cat extends Animal
{
    makeASound()
    {
        "Meo Meo"
    }
}

//program to perform all arthematic operation by using  scanner
// program to implement all conditional control statement
// program to implement all looping statement
//prograam to implement array  and to search the  element in an array
//program to implement matrix
//program to implement string

Interfaces
----------

<access modifier> interface <interface name>
{
Function declarations;
<return type> <function name>(<argument list>);
}

Interfaces are implemented through classes.
Interfaces are defined to insist the classes to define the definition of the methods declared in it.

Implementation
--------------
<access modifier> class <class name> implements <interface names...>(more than 1 interfacses can be implemented)


interface KEBRules
{
void installEnergyMeter();
}

interface MUDARules
{
void leaveSetBacks(int distanceInFeetEW,int distanceInFeetNS);
}

class HouseConstruction implements KEBRules, MUDARules
{
    public void installEnergyMeter()
    {
        System.out.println("Energy meter is installed");
    }

    public void leaveSetBacks(int distanceInFeetEW,int distanceInFeetNS)
    {
        System.out.println("Set backs are taken care");
    }
}

Interfaces can be instantiated as reference objects
---------------------------------------------------

<interface name> <interface ref/obj name>;

// Assume a transcation in a library where the issue and return are the key process. Each process has its own existance and also available for Librarian and Student

Class
- LIBLibrarian
- LIBStudent

Interface
- LIBTransaction

Interface
----------
1. Collection of Abstract Methods
2. Collection of Final Variables - Constant values
3. Default methods - Method defined in Interface with default keyword
4. Static methods


interface DrivingRules
{
void followSignals();
int FINEFORSIGNALJUMP=100;
int FINEFOROVERSPEEDING=400;
}

class DrivingMotorVehicle implements DrivingRules
{
void followSignals()
{
Statement goes here...
}

int calculateFine(String violationDesc)
{
if(violationDesc.equals("Signal Jump")
   return FINEFORSIGNALJUMP;
}

// e-commerce: Assume a scenario where the product details are stored and depending upon the month, show relevant discounts

// Exceptions
Throwable
    - Exception - Can be handled through code blocks
    - Error - Cannot be handled through code blocks

Exception
- User defined exceptions
- Pre-defined exceptions


Exception Blocks - Exception handlers

try
    {
    ---
    ---
    ---
    ---
    ---
    Code which might through Exceptions
    }
catch(<Exception Class> <Exception Object>)
    {
    ---
    ---
    ---
    code to handle Exception object received
    }
catch(<Exception Class> <Exception Object>)
    {
    ---
    ---
    ---
    code to handle Exception object received
    }
catch(<Exception Class> <Exception Object>)
    {
    ---
    ---
    ---
    code to handle Exception object received
    }
.
.
.
.
.
.
finally()
{
-
-
-
Code gets executed for each exception handling
}

Inheritance of Exception
------------------------

Exception - Base class for all Exceptions in JAVA

User defined Exception
----------------------
<access modifier> class <class name> extends Exception
{

// Constructor
<access modifier> <class name>(String str)
{
super(str);
-
-
-
-
}


}

throw -  this is a keyword which is used to alert an Exception object to the calling function/class

throw <Exception class object>;

Exception will be thrown in a statement which is defined in a function

Function should be explicitly indicated that it is throwing an Exception

<access modifier> <return type> <function name>(<argument list>) throws <ExceptionClassName which will be thrown from this function>
{
-
-
-
-
throw <ExceptionClassObject>
}

toString() is a method which is used to show

// Exception Chaining and Multiple Exception catch block

Bank
- Avg Monthly min Bal = 5000
- Fine for not maintaining AVG Balance=200

Current Balance = 5100
    Withdraw=2000
    Withdraw=3000
    .
    .
    .
    .
    .
    .
    .
    1 month over
    Withdraw=100;
        - AVGMonthlyBalanceNotMaintainedError
        - InsufficientBalance

        due to non avg balance balance will be -100 after fine
            Throw InsufficientBalanceError

1 functions used for Exception Chaining

1. initCause(<Exception Object>)
2. getCause();


Multiple Exception Catch Block

try
{
.
.
.
.
}
catch(<Exception1> | <Exception2> | <Exception3>)
{
.
.
.
}

e.g.

Login
-----
    Username
    Password
        validate Username and Password
            if Invalid
                   Username?? -> Username is invalid - InvalidUserNameException
                   Password?? -> Password is invalid - InvalidPasswordException
                   Both?? -> Username and Password is invalid


try
{
    //username validation??
}
catch(InvalidUserNameException | InvalidPasswordException ex)
{
    // Invalid Username/Password
}


// Assignment

Assume a scenario in eCommerce where the below operations are supported
a. Product creation with Supplier details
b. Product Grouping under category name
c. User registration
d. Product purchase
e. Product discounts - Promotional offer based on the DiscountCode

// Packages
folder name should be same as packagename

each class file name should have 1st statement as package

package <packagename>;

in case of subfolders, folder name w.r.t packages are represented using "." separator

// enum - enumeration - Constant definition

class Constant
{
public static final String NAME="VISH";
}

Constant.NAME

OR

enum Constant
{
<Constant Identifier1>; = 0
<Constant Identifier2>; = 1
......
}

Constant.<Constant Identifier1>

how to create instance of enum

<enum name> <enum variable>;

Utility classes
---------------
1. ArrayList - Collection of values (value can be of anytype)

1. Array List as generic for anything
2. Typed Array List

ArrayList<Data Type> <Object name>=new ArrayList();

<Array List Object Name>. => Access parameters and methods available

Assignment
Assume a scenario in a hospital where patient registration/admission process to be automated
1. Patient registration
2. Doctor allocation for Patient
3. Admission details
4. Case sheet view with Patient history details
5. List of patients for the given doctor

- Observation
1 Admission= 1 Patient - Done
1 Patient = Multiple Doctors - Done
1 Patient = Multiple ailments - Done
1 Ailment = Multiple medications - Done
1 Doctor = Multiple specialization - Done








