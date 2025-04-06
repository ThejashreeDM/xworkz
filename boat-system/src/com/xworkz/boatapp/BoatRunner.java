package com.xworkz.boatapp;
import com.xworkz.boatapp.boat.Boat;
public class BoatRunner
{
    public static void main(String[] args) {

        Boat boat=new Boat();
        boat.setBoatId(1);
        boat.setBoatName("Baba's Boat");
        boat.setBoatOwner("Baba");
        boat.setBoatType("Motor Boat");
        System.out.println("Boat Id is : "+boat.getBoatId(););
        System.out.println("Boat name : "+boat.getBoatName());
        System.out.println("Boat Owner : "+boat.getBoatOwner());
        System.out.println("Boat Type : "+boat.getBoatType());
    }
}
