package com.company;

public abstract class Animal
{
    protected int noOfLegs;
    protected boolean hasTail;

    public Animal()
    {
        noOfLegs=4;
        hasTail=true;
    }

    public void makeASound()
    {
        System.out.println("Dont know!");
    }

}
