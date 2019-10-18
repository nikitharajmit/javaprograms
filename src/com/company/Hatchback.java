package com.company;

public class Hatchback extends Car

{
    private int length;

    public Hatchback()
    {
        length=50;
    }

    public void showCarPropeties()
    {
        showProperties();
        System.out.println("Length:"+length);
        speed();
    }

    public void speed()
    {
        System.out.println("Speed of this Hatchback is 100 KMPH");
    }
}
