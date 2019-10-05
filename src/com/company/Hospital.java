package com.company;

public class Hospital {
    private int patientID;
    private String patientName;
    private String patientAdd;
    private String bloodgroup;

    public void patientDetials(int pId,String pName,String pAdd,String bloodg){
        patientID=pId;
        patientName=pName;
        patientAdd=pAdd;
        bloodgroup=bloodg;
    }
    public void showPatientDetails(){
        System.out.println("Patient ID:"+patientID+"\nPatient name:"+patientName+"\nPatient Address:"+patientAdd+"\nPatient Bloodgroup:"+bloodgroup);
    }
}
