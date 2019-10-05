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

