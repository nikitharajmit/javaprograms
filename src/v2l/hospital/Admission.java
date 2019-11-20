package v2l.hospital;

import javax.print.Doc;

public class Admission extends Patient implements Medications
{
    private int admissionid;
    private String admissionMonth;
    private Doctor doctor;

    public Admission(int admissionid,String admissionMonth,int pid, String patientName, String bloogGroup, Ailments ailments)
    {
        super(pid, patientName, bloogGroup, ailments);
        this.admissionid=admissionid;
        this.admissionMonth=admissionMonth;
        allocateDoctor("Prashanth");
    }

    private void allocateDoctor(String docname)
    {
        doctor=new Doctor(101,docname,"GENERAL PHYSICIAN");
    }

    public String diaognize()
    {
        /*if(getAilment()==Ailments.FEVER)
        {
            return "Viral fever and please be advised to take paracetamol";
        }
        else
        {
           return "Wheezing and please be advised to take nebulization";
        }*/

        switch (getAilment())
        {
            case FEVER:
                return "Viral fever and please be advised to take paracetamol";
            case WHEEZING:
                return "Wheezing and please be advised to take nebulization";
        }
        return "";
    }
    public String caseSheet()
    {
        return "AdmissionID:"+admissionid+" | AdmissionMonth:"+admissionMonth+" | "+getPatientDetails()+" |"+doctor.getDoctorDetails();
    }
    public void dischargeSheet()
    {
        System.out.println("Discharge sheet");
    }

}
