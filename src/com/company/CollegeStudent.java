package com.company;

public class CollegeStudent {
    private int sid;
    private String sName;
    private String sAddress;

    public void registerStudentDetails(int sid,String sName,String sAddress){
        this.sid=sid;
        this.sName=sName;
        this.sAddress=sAddress;
    }
    public void displayStudentDetials(){
        System.out.println("Student ID:"+sid);
        System.out.println("Student Name:"+sName);
        System.out.println("Student Address:"+sAddress);

    }
}
