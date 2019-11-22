package v2l.hospital;

import java.util.ArrayList;

public class Patient
{
    private int id;
    private String name;
    private String bloodgroup;
    private ArrayList<Ailments> ailments;
    private ArrayList<Doctor> doctors;

    public Patient()
    {
        doctors=new ArrayList<Doctor>();
        ailments=new ArrayList<Ailments>();
    }


    public void createPatient(int id,String name, String bloodgroup, ArrayList<Ailments> ailment)
    {
        this.id=id;
        this.name=name;
        this.bloodgroup=bloodgroup;
        this.ailments=ailment;
    }

    public String getPatientDetails()
    {
        return "PID:"+this.id+" | PName:"+this.name+" | BG:"+this.bloodgroup;
    }

    public ArrayList<Ailments> getAilmentList()
    {
        return ailments;
    }

    public String getAilments()
    {
        String ailm="AILMENTS:";
        for(int i=0;i<ailments.size();i++)
            ailm=ailm+"-"+ailments.get(i);

        return ailm;
    }

    public void allocateDoctors(ArrayList<Doctor> doctorList)
    {
        doctors=doctorList;
    }

    public String getDoctorsDetails()
    {
        String doc="DOCTORS:";
        for(int i=0;i<doctors.size();i++)
            doc=doc+" <---> "+doctors.get(i).getDoctorDetails();

        return doc;
    }
}
