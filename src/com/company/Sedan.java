package com.company;

public class Sedan extends Car
{
    private int length;

    public Sedan()
    {
        length=100;
    }

    public void showCarProperties()
    {
        showProperties();
        System.out.println("Length:"+length);
        speed();
    }

    public void speed()
    {
        System.out.println("Speed of this Sedan is 140 KMPH");
    }

}
