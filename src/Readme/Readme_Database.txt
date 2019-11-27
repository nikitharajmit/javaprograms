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



