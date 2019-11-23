package v2l.hospital;

import java.util.ArrayList;

public class Doctor
{
    private int id;
    private String name;
    private ArrayList<Ailments> specialization;

    public Doctor()
    {
        specialization=new ArrayList<Ailments>();
    }


    public void createDoctor(int id,String name, ArrayList<Ailments> specialization)
    {
        this.id=id;
        this.name=name;
        this.specialization=specialization;
    }

    public String getDoctorDetails()
    {
        return " DID:"+this.id+" | Doctor Name:"+this.name;
    }

    public String getDoctorSpecialization()
    {
        String spec="SPEC:";

        for(int i=0;i<specialization.size();i++)
            spec=spec+"-"+specialization.get(i);

        return spec;
    }

    public boolean isSpeciclized(Ailments spec)
    {
        for(int i=0;i<specialization.size();i++)
            if(specialization.get(i)==spec)
                return true;
        return false;
    }
}
