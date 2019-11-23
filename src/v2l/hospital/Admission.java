package v2l.hospital;

import javax.print.Doc;
import java.util.ArrayList;

public class Admission extends Patient implements ActionsToBeTaken
{
    private int admissionid;
    private Month admissionMonth;
    private ArrayList<Ailments> ailments;
    private ArrayList<Doctor> availableDoctors;
    private ArrayList<Ailments> medications;

    public Admission()
    {
        this.availableDoctors=new ArrayList<Doctor>();
        this.medications=new ArrayList<Ailments>();
    }

    public void setAvailableDoctorsList(ArrayList<Doctor> doctorsList)
    {
        this.availableDoctors=doctorsList;
    }

    public void createAdmission(int admissionid,Month admissionMonth,int pid, String patientName, String bloogGroup, ArrayList<Ailments> ailments)
    {

        this.admissionid=admissionid;
        this.admissionMonth=admissionMonth;
        this.ailments=ailments;
        super.createPatient(pid, patientName, bloogGroup, ailments);
        super.allocateDoctors(allocateDoctor());
    }

    private ArrayList<Doctor> allocateDoctor()
    {
        ArrayList<Doctor> doctorsForPatient=new ArrayList<Doctor>();

        for(int i=0;i<availableDoctors.size();i++)
        {
            for(int j=0;j<ailments.size();j++)
            {
                if (availableDoctors.get(i).isSpeciclized(ailments.get(j)))
                {
                    doctorsForPatient.add(availableDoctors.get(i));
                }
            }
        }
        return doctorsForPatient;
    }


    public String showAdmissinDetails()
    {
        return "AdmissionID:"+admissionid+" | AdmissionMonth:"+admissionMonth+"\n"+getPatientDetails()+"\n"+getAilments()+"\n"+getDoctorsDetails();
    }

    public String diaognize(){
      /* if(getAilments().equals(Ailments.FEVER))
        {
            return "Viral fever and please be advised to take paracetamol";
        }
        else if(getAilments().equals(Ailments.WHEEZING))
        {
           return "Wheezing and please be advised to take nebulization";
        }
       else if(getAilments().equals(Ailments.COUGH))
       {
           return "Cough and please be advised to take Flonase";
       }  else if(getAilments().equals(Ailments.CARDIO))
       {
           return "Cardio and please be advised to take Rivaroxaban";
       }
       return "";*/

        for(int i=0;i<=getAilmentList().size();i++) {
            switch (getAilmentList().get(i)) {

                case FEVER:
                    return "Viral fever and please be advised to take paracetamol";

                case WHEEZING:
                    return "Wheezing and please be advised to take nebulization";

                case COUGH:
                    return "Cough and please be advised to take Flonase";

            }
        }
            return "";

    }


}
