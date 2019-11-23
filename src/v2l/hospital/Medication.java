package v2l.hospital;

import java.util.ArrayList;

public class Medication
{
    private Ailments ailment;
    private ArrayList<String> prescriptions;

    public Medication()
    {
        prescriptions=new ArrayList<String>();
    }
    public void setMedication(Ailments ailment,ArrayList<String> medications)
    {
        this.ailment=ailment;
        this.prescriptions=medications;
    }

}
