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

    public void registerStudent(int sid,String sname,String sadd, String sbg, String spc,String sac)
    {
        studentId=sid;
        studentName=sname;
        studentAddress=sadd;
        bloodGroup=sbg;
        preferredCourse=spc;
        courseAllotted=sac;
    }
    public void showStudentdetails()
    {
        //Code goes here
        System.out.println("Student id:"+studentId+"\nStudent Name:"+studentName+"\nStudent Address:"+studentAddress+"\nBlood group:"+bloodGroup+"\nPreferred Course"+preferredCourse+"\nAllocated Course"+courseAllotted);
    }
    public String getStudentdetails(){

        /*      String studentDetails;
        studentDetails="Student id:"+studentId+"\nStudent Name:"+studentName+"\nStudent Address:"+studentAddress+"\nBlood group:"+bloodGroup+"\nPreferred Course"+preferredCourse+"\nAllocated Course"+courseAllotted;
        return studentDetails;*/

        return "Student id:"+studentId+"\nStudent Name:"+studentName+"\nStudent Address:"+studentAddress+"\nBlood group:"+bloodGroup+"\nPreferred Course"+preferredCourse+"\nAllocated Course"+courseAllotted;

    }

    public Student(){
        courseAllotted="computer science";
    }
}
