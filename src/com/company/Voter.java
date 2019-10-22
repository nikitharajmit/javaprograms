package com.company;

public class Voter extends UniqueIdentification
{
    private Address voterAddress;
    private EligibilityDetails voterEligibilityDetails;

    public Voter()
    {
        voterAddress=new Address();
        voterEligibilityDetails=new EligibilityDetails();
    }

    public void registerVoterDetails(int hno,String streetAddress, String location, String pincode, int age,int voterId)
    {
        voterAddress.setAddress(hno,streetAddress,location,pincode,voterId);
        voterEligibilityDetails.setAge(age,voterId);
        super.setVoterId(voterId);
    }

    public void displayVoterDetails()
    {
        voterAddress.displayAddress();
    }

    public boolean isEligible()
    {
        return voterEligibilityDetails.isEligible();
    }

}
