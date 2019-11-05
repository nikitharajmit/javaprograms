package com.company;


interface KEBRules
{
    void installEnergyMeter();
}

interface MUDARules
{
    void leaveSetBacks(int distanceInFeetEW,int distanceInFeetNS);
}

public class HouseConstruction implements KEBRules, MUDARules
{
    public void installEnergyMeter()
    {
        System.out.println("Energy meter is installed");
    }

    public void leaveSetBacks(int distanceInFeetEW,int distanceInFeetNS)
    {
        System.out.println("Set backs are taken care");
    }
}
