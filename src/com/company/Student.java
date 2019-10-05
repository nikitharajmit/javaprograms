package com.company;

public class Student
{
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String bloodGroup;
    private String preferredCourse;
    private String courseAllotted;

    public void registerStudent(int sid,String sname,String sadd, String sbg, String spc)
    {
        studentId=sid;
        studentName=sname;
        studentAddress=sadd;
        bloodGroup=sbg;
        preferredCourse=spc;
    }

    public void viewStudentDetails()
    {
        System.out.println("Student Id:"+studentId);
        System.out.println("Student Name:"+studentName);
        System.out.println("Student Address:"+studentAddress);
        System.out.println("Student Bloog Group:"+bloodGroup);
        System.out.println("Student Preferred Course:"+preferredCourse);
        System.out.println("Student Courses Allocated:"+courseAllotted);

    }

    public void allocateCourse()
    {
        if (studentId%2==0)
            courseAllotted="Computer Science";
        else
            courseAllotted="Electricals";
    }
}
