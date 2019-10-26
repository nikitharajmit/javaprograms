package com.company;

public class College {
    private CollegeStudent studentinfo[]=new CollegeStudent[5];
    private String cCode;
    private String cName;
    private String cAddress;
    private int studnetCounter=0;

    public College(){
        for (int i=0;i<5;i++){
            studentinfo[i]=new CollegeStudent();
        }
    }
    public void collegeDetails(String cCode,String cName,String cAddress){
        this.cCode=cCode;
        this.cName=cName;
        this.cAddress=cAddress;
    }
    public void showCollegeDetails(){
        System.out.println("College Code:"+cCode);
        System.out.println("College Name:"+cName);
        System.out.println("College Address:"+cAddress);
    }
    public String getcName(){
        return cName;
    }
    public void createStudentDetails(int sid,String sName,String sAddress){
        studentinfo[studnetCounter].registerStudentDetails(sid,sName,sAddress);
        studnetCounter++;
    }
    public void showStudentDetails(){
        for(int i=0;i<5;i++){
            studentinfo[i].displayStudentDetials();
        }

    }


}
