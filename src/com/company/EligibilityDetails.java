package com.company;

public class EligibilityDetails extends UniqueIdentification
{
    private int age;
    private boolean eligible;

    public EligibilityDetails()
    {
        eligible=true;
    }

    public void setAge(int age, int voterId)
    {
        if(age>=18)
        {
            this.age = age;
            super.setVoterId(voterId);
        }
        else
            eligible=false;
    }

    public boolean isEligible()
    {
        return eligible;
    }

}
