package com.company;

public class Address extends UniqueIdentification
{
    private int hno;
    private String streetAddress;
    private String location;
    private String pincode;

    public void setAddress(int hno,String streetAddress,String location,String pincode,int voterId)
    {
        this.hno=hno;
        this.streetAddress=streetAddress;
        this.location=location;
        this.pincode=pincode;
        super.setVoterId(voterId);
    }

    public void displayAddress()
    {
        System.out.println("VoterId:"+super.getVoterId());
        System.out.println("HNo:"+this.hno);
        System.out.println("Street Address:"+this.streetAddress);
        System.out.println("Location:"+this.location);
        System.out.println("Pincode:"+this.pincode);
    }


}
