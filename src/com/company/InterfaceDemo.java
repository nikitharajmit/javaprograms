package com.company;

interface DrivingRules
{
    void followSignals();
    int VIOLATIONSG=1;
    int VIOLATIONOS=2;
    int FINEFORSIGNALJUMP=100;
    int FINEFOROVERSPEEDING=4000;
    default String getName()
    {
        return "DrivingRules";
    }

    default int getNoOfConstants()
    {
        return 4;
    }

    static void showFineFor(int violationCode)
    {
        switch(violationCode)
        {
            case VIOLATIONSG:
                System.out.println("Fine Amount:"+FINEFORSIGNALJUMP);
                break;
            case VIOLATIONOS:
                System.out.println("Fine Amount:"+FINEFOROVERSPEEDING);
        }
    }

}


public class InterfaceDemo implements  DrivingRules
{
    public void followSignals()
    {
        System.out.println("Signals followed");
    }

    public int calculateFine(int violationCode)
    {
        switch(violationCode)
        {
            case VIOLATIONSG:
                return FINEFORSIGNALJUMP;
            case VIOLATIONOS:
                return FINEFOROVERSPEEDING;
        }
        return -1;
    }
}
