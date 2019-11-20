package v2l.mainfunction;

import v2l.hospital.Admission;
import v2l.hospital.Ailments;

public class Main
{
    public static void main(String args[])
    {
        System.out.println("New Package: V2L.eCOMMERCE");

        Admission admission=new Admission(1011,"November",3056,"Kiran","O+",Ailments.WHEEZING);
        System.out.println(admission.caseSheet());
        System.out.println(admission.diaognize());

    }
}

