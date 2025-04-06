package com.xworkz.itkee;
import com.xworkz.itkee.itkemodule.Itke;

public class ItkeRunner
{
    public static void display(Itke itke) {
        System.out.println("Name         : " + itke.getName());
        System.out.println("Type         : " + itke.getType());
        System.out.println("Manufacturer : " + itke.getManufacturer());
        System.out.println("Weight (kg)  : " + itke.getWeight());
        System.out.println("Color        : " + itke.getColor());
        System.out.println("Price        : ₹" + itke.getPrice());
        System.out.println("Available?   : " + itke.getIsAvailable());
        System.out.println();
    }

    public static void main(String[] args)
    {
        Itke itke1 = new Itke();
        itke1.setName("Itke Alpha");
        itke1.setType("Tool");
        itke1.setManufacturer("TechTools");
        itke1.setWeight(1.2);
        itke1.setColor("Red");
        itke1.setPrice(799.00);
        itke1.setIsAvailable(true);
        display(itke1);

        Itke itke2 = new Itke();
        itke2.setName("Itke Pro");
        itke2.setType("Device");
        itke2.setManufacturer("MegaCorp");
        itke2.setWeight(0.9);
        itke2.setColor("Red");
        itke2.setPrice(1499.00);
        itke2.setIsAvailable(true);
        display(itke2);

        Itke itke3 = new Itke();
        itke3.setName("Itke Mini");
        itke3.setType("Accessory");
        itke3.setManufacturer("NanoWorks");
        itke3.setWeight(0.5);
        itke3.setColor("Black");
        itke3.setPrice(499.00);
        itke3.setIsAvailable(false);
        display(itke3);

        Itke itke4 = new Itke();
        itke4.setName("Itke Ultra");
        itke4.setType("Gadget");
        itke4.setManufacturer("GigaTech");
        itke4.setWeight(2.0);
        itke4.setColor("Silver");
        itke4.setPrice(1899.00);
        itke4.setIsAvailable(true);
        display(itke4);

        Itke itke5 = new Itke();
        itke5.setName("Itke Eco");
        itke5.setType("Green Device");
        itke5.setManufacturer("EcoMakers");
        itke5.setWeight(1.5);
        itke5.setColor("White");
        itke5.setPrice(999.00);
        itke5.setIsAvailable(false);
        display(itke5);
    }
    }



