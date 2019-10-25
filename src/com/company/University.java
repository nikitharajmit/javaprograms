package com.company;

public class University {
    private College collegeinfo[5];
    private String titlename;
    private String address;
    private String uCode;
    private int contact;

    public void inputUniversityDetails(College collegeinfo,String titlename,String address,String uCode,int contact){
        this.collegeinfo=collegeinfo;
        this.titlename=titlename;
        this.address=address;
        this.uCode=uCode;
        this.contact=contact;
    }

    public void displayUniversityDetails(){
        collegeinfo.displayCollegeDetails();
        System.out.println("Title Name:"+titlename);
        System.out.println("Address:"+address);
        System.out.println("University Code:"+uCode);
        System.out.println("Contact:"+contact);
    }
    }

