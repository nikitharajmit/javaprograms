package v2l.hospital;

public class Patient
{
    private int id;
    private String name;
    private String bloodgroup;
    private Ailments ailment;


    public Patient(int id,String name, String bloodgroup, Ailments ailment)
    {
        this.id=id;
        this.name=name;
        this.bloodgroup=bloodgroup;
        this.ailment=ailment;
    }

    public String getPatientDetails()
    {
        return "PID:"+this.id+" | PName:"+this.name+" | BG:"+this.bloodgroup+" | AILMENT:"+this.ailment;
    }

    public Ailments getAilment()
    {
        return ailment;
    }
}
