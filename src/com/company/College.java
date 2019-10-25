package com.company;

public class College {
    private CollegeStudent studentinfo[15];
    private String cCode;
    private String cName;
    private String cAddress;

    public void inputCollegeDetials(CollegeStudent studentinfo,String cCode,String cName,String cAddress){
        this.studentinfo=studentinfo;
        this.cCode=cCode;
        this.cName=cName;
        this.cAddress=cAddress;
    }
    public void displayCollegeDetails(){
        studentinfo.displayStudentDetials();
        System.out.println("College ID:"+cCode);
        System.out.println("College Name:"+cName);
        System.out.println("College Address:"+cAddress);
    }
}
