package com.xworkz.watertankk;
import com.xworkz.watertankk.watertankmodule.WaterTank;
public class WaterTankRunner
{


        public static void display(WaterTank tank) {
            System.out.println("Water Tank ID     : " + tank.getTankId());
            System.out.println("Brand Name        : " + tank.getBrandName());
            System.out.println("Capacity (liters) : " + tank.getCapacity());
            System.out.println("Color             : " + tank.getColor());
            System.out.println("Material          : " + tank.getMaterial());
            System.out.println("Price             : " + tank.getPrice());
            System.out.println("Shape             : " + tank.getShape());
            System.out.println("Owner Name        : " + tank.getOwnerName());
            System.out.println();
        }

        public static void main(String[] args)
        {
            WaterTank tank1 = new WaterTank();
            tank1.setTankId(1);
            tank1.setBrandName("Sintex");
            tank1.setCapacity(1000.0);
            tank1.setColor("White");
            tank1.setMaterial("Plastic");
            tank1.setPrice(4500.00);
            tank1.setShape("Cylindrical");
            tank1.setOwnerName("Ravi");
            display(tank1);

            WaterTank tank2 = new WaterTank();
            tank2.setTankId(2);
            tank2.setBrandName("Vectus");
            tank2.setCapacity(1500.0);
            tank2.setColor("Black");
            tank2.setMaterial("HDPE");
            tank2.setPrice(6200.00);
            tank2.setShape("Round");
            tank2.setOwnerName("Meena");
            display(tank2);

            WaterTank tank3 = new WaterTank();
            tank3.setTankId(3);
            tank3.setBrandName("Plasto");
            tank3.setCapacity(2000.0);
            tank3.setColor("Yellow");
            tank3.setMaterial("Plastic");
            tank3.setPrice(7800.00);
            tank3.setShape("Square");
            tank3.setOwnerName("Shiva");
            display(tank3);

            WaterTank tank4 = new WaterTank();
            tank4.setTankId(4);
            tank4.setBrandName("Storewel");
            tank4.setCapacity(750.0);
            tank4.setColor("Blue");
            tank4.setMaterial("PVC");
            tank4.setPrice(3900.00);
            tank4.setShape("Vertical");
            tank4.setOwnerName("Anjali");
            display(tank4);

            WaterTank tank5 = new WaterTank();
            tank5.setTankId(5);
            tank5.setBrandName("Penguin");
            tank5.setCapacity(500.0);
            tank5.setColor("Green");
            tank5.setMaterial("Stainless Steel");
            tank5.setPrice(9000.00);
            tank5.setShape("Rectangle");
            tank5.setOwnerName("Kiran");
            display(tank5);
        }
    }


