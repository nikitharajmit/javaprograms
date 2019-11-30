Database
--------
-> Persistent storage of data
-> Relational representation of data

Database
-> Collection of tables / entities

COL 1       COL 2                                           -> Fields / Columns / Attributes
---------------------------------------------------------
EID     |       ENAME       | ESALARY       | DOJ
---------------------------------------------------------
101     |       VISH        | 25000         | 12-Jan-2019 -> Record / Row / Tuple
.
.
.
.
.


Database Operations
    -> Data definition
    -> Data Manipulate
    -> Data Control

Data definition -> applied for Tables
    -> Create
    -> Alter
    -> Drop
    -> Describe

Data Manipulate -> applied for Records
    -> Insert
    -> Update
    -> Delete
    -> Select

Data Control -> applied for Transactions
    -> Save
    -> Drop

DBMS - Database Management System
-> Oracle
-> SQL Server
-> Sybase
-> MongoDB
-> MySQL - We will learn
-> PpostgreSQL
-> SQLlite
.
.
.



DDL
---

create database <database name>

drop database <database name>

getting into the scope of database for executing SQL queries in Mysql
    use database <database name>

1. Create

create table <table name>
(
<field name1> <data type> [<constraint(s)>],
<field name2> <data type> [<constraint(s)>],
<field name3> <data type> [<constraint(s)>],
.
.
.

<field name n> <data type> [<constraint(s)>]
);


2. Alter

alter table <table name> ADD/MODIFY/DROP COLUMN <Column name> <data type> <constraint>;

3. Drop

drop table <table name>

DML
---

1. Insert

insert into <table name>[(<column1 name>,<column2 name>......)] values (<value for column1>,<value for column2>.......)

2. Select

select */[(<column1 name>,<column2 name>......)] from <table name> where [Condition(s)]

condition
<column name> <rel operator> <value>/<column name>
rel operators: ==/!=/>/>=/</<=
logical operators: and/or/not

conditional expression
----------------------
<column name> <operator> <column name> / <constant value> <logical operator> ........

e.g.

Assume a table having employee details of an organization with following columns
EMPLOYEE
--------
1. Eid
2. Ename
3. Esalary
4. EDepartment_name - 'SALES', 'PRODUCTION', 'PURCHASE'
6. EDesignation - 'DEVELOPER', 'TESTER', 'MANAGER'

1. find the list of employees who have salary more than 50,000 and their designation is 'manager'
a. What to select - Columns
    i. is it from single table or multiple table? - multiple tables: JOIN Operation
b. Conditions on what column?

    select Eid, Ename, Esalary, EDepartment_name from employee where Esalary>=50000 and Edesignation='MANAGER'

JOIN Operations
---------------
selecting columns from more than 1 table with necessary conditions in place (Conditions are always between primary key column and foreign key column)

select <column names> from <table names (differenciated by ','> where <table name>.<column name>=<column name> / <constant value> / <table name>.<column name>

select <column names> from <table names (differenciated by 'INNER/LEFT OUTER/RIGHT OUTER/CROSS JOIN'> ON <table name>.<column name>=<table name>.<column name> / <constant value> / <column name> and <other condictions>

Assume a table having employee details of an organization with following columns
EMPLOYEE
--------
1. Eid - PK
2. Ename
3. Esalary
4. EDesignation - 'DEVELOPER', 'TESTER', 'MANAGER'
5. Did - FK for Department table

DEPARTMENT
----------
1. Did - PK
2. Dname - 'SALES', 'PRODUCTION', 'PURCHASE'

1. Select the employees who work for 'SALES' department

select eid, ename, esalary, edesignation from employee,department where dname='SALES'

SELECT eid, ename,esalary
  FROM employee INNER JOIN department ON employee.did = department.did;

Assume a table having employee details of an organization with following columns
EMPLOYEE
--------
1. Eid - PK
2. Ename
3. Esalary
4. Did - FK for Department table
5. Desid - FK for Designation table

DESIGNATION
-----------
1. desid
2. Designationname - 'DEVELOPER', 'TESTER', 'MANAGER'

DEPARTMENT
----------
1. Did - PK
2. Dname - 'SALES', 'PRODUCTION', 'PURCHASE'

1. Select the employees who work for 'PRODUCTION' department and have 'DEVELOPER' as their designation

select eid, ename, esalary, edesignation from employee,department,designation where employee.did=department.did and employee.desid=designation.desid and dname='PRODUCTION' and designationname='DEVELOPER'

SELECT id, ename,salary,dname, designationname
  FROM department INNER JOIN employee INNER JOIN designation ON employee.did = department.did and employee.desid=designation.desid;

in JOIN Operation

1. Columns to select
2. Tables to select
3. JOIN conditions between PK column and FK column of tables selected
4. Other condiction which is required to further filter the records


Update
-----
update <table name> set <column name>=<value>,<column name>=<value>...... [where <condition>]

delete
------
delete from <table name> [where <condition>]


TYPE OF JOINS
-------------
INNER JOIN (Intersection)
LEFT OUTER JOIN (Left join)
RIGHT OUTER JOIN (Right join)
CROSS JOIN (Cross)










