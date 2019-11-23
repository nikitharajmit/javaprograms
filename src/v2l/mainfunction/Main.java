package v2l.mainfunction;

import v2l.hospital.*;

import java.util.ArrayList;

// Constant Definition

/*
enum Loan
{
    PERSONALLOAN,
    BUSINESSLOAN,
    HOMELOAN
}
*/

public class Main
{
    public static void main(String args[])
    {

        // DOCTOR MASTERS
        ArrayList<Doctor> doctors=new ArrayList<Doctor>();

        // DOCTOR 1
        doctors.add(new Doctor());
        ArrayList<Ailments> d1specializations=new ArrayList<Ailments>();
        d1specializations.add(Ailments.KIDNEY_STONE);
        d1specializations.add(Ailments.CARDIO);
        d1specializations.add(Ailments.WHEEZING);
        doctors.get(doctors.size()-1).createDoctor(1,"Prashanth",d1specializations);

        // DOCTOR 2
        doctors.add(new Doctor());
        ArrayList<Ailments> d2specializations=new ArrayList<Ailments>();
        d2specializations.add(Ailments.FEVER);
        d2specializations.add(Ailments.COUGH);
        d2specializations.add(Ailments.CARDIO);
        doctors.get(doctors.size()-1).createDoctor(2,"Ramesh",d2specializations);

        ArrayList<Medication> medicationlist=new ArrayList<Medication>();
        medicationlist.add(new Medication());

        ArrayList<String> feverprescriptions=new ArrayList<String>();
        feverprescriptions.add("Please be advised to take paracetamol daily twice");
        feverprescriptions.add("Please be advised to take rest for 2 days");
        feverprescriptions.add("Please be advised to not use oil foods for 10 days");

        medicationlist.get(medicationlist.size()-1).setMedication(Ailments.FEVER,feverprescriptions);

        ArrayList<Ailments> p1ailments=new ArrayList<Ailments>();
        p1ailments.add(Ailments.FEVER);
        p1ailments.add(Ailments.WHEEZING);

        Admission admission1=new Admission();
        admission1.setAvailableDoctorsList(doctors);
        admission1.createAdmission(1, Month.JAN,1101,"Vish","O+",p1ailments);
        System.out.println(admission1.showAdmissinDetails());
        System.out.println(admission1.diaognize());
        /*
        // SHOW ALL DOCTOR DETAILS
        for(int i=0;i<doctors.size();i++)
            System.out.println(doctors.get(i).getDoctorDetails()+" | "+doctors.get(i).getDoctorSpecialization());

        // DOCTORS by SPECCIALIZATIONS
        System.out.println("SEARCH DOCTOR BY SPECIALIZATION");
        Ailments searchSpec=Ailments.WHEEZING;
        for(int i=0;i<doctors.size();i++)
            if(doctors.get(i).isSpeciclized(searchSpec))
                System.out.println(doctors.get(i).getDoctorDetails()+" | "+doctors.get(i).getDoctorSpecialization());
        */


            /*       Patient patient1=new Patient();
        ArrayList<Ailments> p1ailments=new ArrayList<Ailments>();
        p1ailments.add(Ailments.FEVER);
        p1ailments.add(Ailments.WHEEZING);
        patient1.createPatient(111,"Kiran","O+",p1ailments);
        System.out.println(patient1.getPatientDetails()+" | "+patient1.getAilments());

        ArrayList<Doctor> p1doctors =new ArrayList<Doctor>();
        p1doctors.add(doctor1);
        p1doctors.add(doctor2);
        patient1.allocateDoctors(p1doctors);

        System.out.println(patient1.getDoctorsDetails());


        Patient patient2=new Patient();
        ArrayList<Ailments> p2ailments=new ArrayList<Ailments>();
        p2ailments.add(Ailments.KIDNEY_STONE);
        p2ailments.add(Ailments.CARDIO);
        patient2.createPatient(141,"Pramod","A+",p2ailments);
        System.out.println(patient2.getPatientDetails()+" | "+patient2.getAilments());

        ArrayList<Doctor> p2doctors =new ArrayList<Doctor>();
        p2doctors.add(doctor2);
        patient2.allocateDoctors(p2doctors);

        System.out.println(patient2.getDoctorsDetails());
*/


     /* System.out.println("New Package: V2L.eCOMMERCE");

        Admission admission=new Admission(1011,"November",3056,"Kiran","O+",Ailments.FEVER);
        System.out.println(admission.caseSheet());
        System.out.println(admission.diaognize());

        ArrayList<String> admissionList=new ArrayList<String>();
        admissionList.add("Sunday");
        admissionList.add("Monday");
        admissionList.add("Tuesday");

        System.out.println(admissionList.size());
        admissionList.remove(1);
        System.out.println(admissionList.size());*/

       /* double loanamount,years,totalinterest;
        Loan loanType;

        loanamount=100000;
        years=2;
        loanType=Loan.BUSINESSLOAN;
        totalinterest=0;

        if(loanType==Loan.PERSONALLOAN)
        {
            totalinterest=(loanamount*0.10)*years;
        }
        else if(loanType==Loan.BUSINESSLOAN)
        {
            totalinterest=(loanamount*0.15)*years;
        }
        else if(loanType==Loan.HOMELOAN)
        {
            totalinterest=(loanamount*0.08)*years;
        }

        System.out.println("Total Interest="+totalinterest+"Type of Loan="+loanType);*/




    }
}

