package v2l.hospital;

public class Doctor
{
    private int id;
    private String name;
    private String specialization;


    public Doctor(int id,String name, String specialization)
    {
        this.id=id;
        this.name=name;
        this.specialization=specialization;
    }

    public String getDoctorDetails()
    {
        return " DID"+this.id+" | Doctor Name:"+this.name+" | SPECIALIZATION:"+this.specialization;
    }
}
