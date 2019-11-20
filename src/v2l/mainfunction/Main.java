package v2l.mainfunction;

import v2l.hospital.Admission;
import v2l.hospital.Ailments;
import v2l.hospital.Patient;

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
      System.out.println("New Package: V2L.eCOMMERCE");

        Admission admission=new Admission(1011,"November",3056,"Kiran","O+",Ailments.FEVER);
        System.out.println(admission.caseSheet());
        System.out.println(admission.diaognize());

        ArrayList<String> admissionList=new ArrayList<String>();
        admissionList.add("Sunday");
        admissionList.add("Monday");
        admissionList.add("Tuesday");

        System.out.println(admissionList.size());
        admissionList.remove(1);
        System.out.println(admissionList.size());

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

