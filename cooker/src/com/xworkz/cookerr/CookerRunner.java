package com.xworkz.cookerr;
import com.xworkz.cookerr.cookermodule.Cooker;
public class CookerRunner
{

        public static void display(Cooker cooker) {
            System.out.println("Brand              : " + cooker.getBrand());
            System.out.println("Capacity (L)       : " + cooker.getCapacityInLiters());
            System.out.println("Material           : " + cooker.getMaterial());
            System.out.println("Color              : " + cooker.getColor());
            System.out.println("Electric?          : " + cooker.getIsElectric());
            System.out.println("Price              : ₹" + cooker.getPrice());
            System.out.println("Warranty (Years)   : " + cooker.getWarrantyInYears());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Cooker cooker1 = new Cooker();
            cooker1.setBrand("Prestige");
            cooker1.setCapacityInLiters(5.0);
            cooker1.setMaterial("Aluminium");
            cooker1.setColor("Silver");
            cooker1.setIsElectric(false);
            cooker1.setPrice(1800.00);
            cooker1.setWarrantyInYears(2);
            display(cooker1);

            Cooker cooker2 = new Cooker();
            cooker2.setBrand("Bajaj");
            cooker2.setCapacityInLiters(3.0);
            cooker2.setMaterial("Stainless Steel");
            cooker2.setColor("Grey");
            cooker2.setIsElectric(false);
            cooker2.setPrice(2200.00);
            cooker2.setWarrantyInYears(3);
            display(cooker2);

            Cooker cooker3 = new Cooker();
            cooker3.setBrand("Panasonic");
            cooker3.setCapacityInLiters(4.5);
            cooker3.setMaterial("Plastic & Steel");
            cooker3.setColor("White");
            cooker3.setIsElectric(true);
            cooker3.setPrice(3400.00);
            cooker3.setWarrantyInYears(2);
            display(cooker3);

            Cooker cooker4 = new Cooker();
            cooker4.setBrand("Butterfly");
            cooker4.setCapacityInLiters(2.0);
            cooker4.setMaterial("Hard Anodized");
            cooker4.setColor("Black");
            cooker4.setIsElectric(false);
            cooker4.setPrice(1500.00);
            cooker4.setWarrantyInYears(1);
            display(cooker4);

            Cooker cooker5 = new Cooker();
            cooker5.setBrand("Preethi");
            cooker5.setCapacityInLiters(6.0);
            cooker5.setMaterial("Stainless Steel");
            cooker5.setColor("Silver");
            cooker5.setIsElectric(true);
            cooker5.setPrice(4100.00);
            cooker5.setWarrantyInYears(5);
            display(cooker5);
        }
    }


