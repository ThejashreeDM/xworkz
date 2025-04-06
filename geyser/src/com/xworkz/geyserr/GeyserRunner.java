package com.xworkz.geyserr;
import com.xworkz.geyserr.geysermodule.Geyser;
public class GeyserRunner {
    public static void display(Geyser geyser) {
        System.out.println("Brand           : " + geyser.getBrand());
        System.out.println("Capacity (L)    : " + geyser.getCapacityInLiters());
        System.out.println("Power (W)       : " + geyser.getPowerInWatts());
        System.out.println("Color           : " + geyser.getColor());
        System.out.println("Price           : ₹" + geyser.getPrice());
        System.out.println("Automatic?      : " + geyser.getIsAutomatic());
        System.out.println("Mounting Type   : " + geyser.getMountingType());
        System.out.println();
    }

       public static void main(String[] args) {
        Geyser geyser1 = new Geyser();
        geyser1.setBrand("Bajaj");
        geyser1.setCapacityInLiters(15);
        geyser1.setPowerInWatts(2000);
        geyser1.setColor("White");
        geyser1.setPrice(5500.00);
        geyser1.setIsAutomatic(true);
        geyser1.setMountingType("Vertical");
        display(geyser1);

        Geyser geyser2 = new Geyser();
        geyser2.setBrand("Havells");
        geyser2.setCapacityInLiters(10);
        geyser2.setPowerInWatts(1500);
        geyser2.setColor("Silver");
        geyser2.setPrice(4800.00);
        geyser2.setIsAutomatic(true);
        geyser2.setMountingType("Horizontal");
        display(geyser2);

        Geyser geyser3 = new Geyser();
        geyser3.setBrand("AO Smith");
        geyser3.setCapacityInLiters(25);
        geyser3.setPowerInWatts(3000);
        geyser3.setColor("Beige");
        geyser3.setPrice(7200.00);
        geyser3.setIsAutomatic(true);
        geyser3.setMountingType("Vertical");
        display(geyser3);

        Geyser geyser4 = new Geyser();
        geyser4.setBrand("Crompton");
        geyser4.setCapacityInLiters(5);
        geyser4.setPowerInWatts(1000);
        geyser4.setColor("Blue");
        geyser4.setPrice(3000.00);
        geyser4.setIsAutomatic(false);
        geyser4.setMountingType("Wall");
        display(geyser4);

        Geyser geyser5 = new Geyser();
        geyser5.setBrand("Racold");
        geyser5.setCapacityInLiters(20);
        geyser5.setPowerInWatts(2500);
        geyser5.setColor("Black");
        geyser5.setPrice(6400.00);
        geyser5.setIsAutomatic(true);
        geyser5.setMountingType("Floor");
        display(geyser5);
    }

  }


