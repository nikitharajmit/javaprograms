package com.company;

public class Dog extends Animal implements AnimalSound
{
    public void makeASound()
    {
        System.out.println("Bow Bow");
    }

    public void showDogDetails()
    {
        System.out.println(noOfLegs);
    }
}
