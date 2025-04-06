package com.xworkz.shirtfactory;
import com.xworkz.shirtfactory.shirt.Shirt;

public class ShirtRunner
{
    public static void display(Shirt shirt)
    {
        System.out.println("Shirt Id : "+shirt.getShirtId());
        System.out.println("Shirt Brand : "+shirt.getBrandName());
        System.out.println("Shirt Color : "+shirt.getColor());
        System.out.println("Shirt Size : "+shirt.getSize());
        System.out.println("Is Shirt Full Arm? : "+shirt.getIsFullArm());
        System.out.println("Is Plain Shirt ? : "+shirt.getIsPlain());
        System.out.println("Is Pocket AVailable ? : "+shirt.getIsPocketAvailable());
        System.out.println();
        System.out.println();

    }
    public static void main(String args[])
    {
        Shirt shirt1=new Shirt();
        shirt1.setShirtId(1);
        shirt1.setBrandName("Peter England");
        shirt1.setColor("Blue");
        shirt1.setSize("M");
        shirt1.setIsFullArm(true);
        shirt1.setIsPlain(true);
        shirt1.setIsPocketAvailable(true);
        ShirtRunner.display(shirt1);


        Shirt shirt2=new Shirt();
        shirt2.setShirtId(2);
        shirt2.setBrandName("Arrow");
        shirt2.setColor("White");
        shirt2.setSize("L");
        shirt2.setIsFullArm(false);
        shirt2.setIsPlain(false);
        shirt2.setIsPocketAvailable(false);
        ShirtRunner.display(shirt2);

        Shirt shirt3=new Shirt();
        shirt3.setShirtId(3);
        shirt3.setBrandName("Van Heusen");
        shirt3.setColor("Black");
        shirt3.setSize("XL");
        shirt3.setIsFullArm(true);
        shirt3.setIsPlain(false);
        shirt3.setIsPocketAvailable(true);
        ShirtRunner.display(shirt3);

        Shirt shirt4=new Shirt();
        shirt4.setShirtId(4);
        shirt4.setBrandName("Louis Philippe");
        shirt4.setColor("Gray");
        shirt4.setSize("M");
        shirt4.setIsFullArm(false);
        shirt4.setIsPlain(true);
        shirt4.setIsPocketAvailable(false);
        ShirtRunner.display(shirt4);

        Shirt shirt5=new Shirt();
        shirt5.setShirtId(5);
        shirt5.setBrandName("Allen Solly");
        shirt5.setColor("Red");
        shirt5.setSize("S");
        shirt5.setIsFullArm(true);
        shirt5.setIsPlain(true);
        shirt5.setIsPocketAvailable(true);
        ShirtRunner.display(shirt5);

    }
}
