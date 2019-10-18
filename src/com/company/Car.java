package com.company;

public class Car
{
    private int wheels;
    private boolean steering;
    private String engine;

    public void speed()
    {
        System.out.println("Car must have a speed definition");
    }

    public void inputCarProperties(int wheels,boolean steering, String engine)
    {
        this.wheels=wheels;
        this.steering=steering;
        this.engine=engine;
    }

    private void outputCarProperties()
    {
        String steering;
        steering=(this.steering)?"Yes":"No";

        System.out.println("Wheels:"+wheels+"\nSteering="+steering+"\nEngine:"+engine);
    }

    protected void showProperties()
    {
        outputCarProperties();
    }

}
