package com.company;

interface AnimalSound
{
    void makeASound();
}

public abstract class Animal
{
    protected int noOfLegs;
    protected boolean _hasTail;

    public Animal()
    {
        noOfLegs=4;
        _hasTail=true;
    }

    public boolean hasTail()
    {
        return this._hasTail;
    }

}
