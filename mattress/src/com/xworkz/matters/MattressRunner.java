package com.xworkz.matters;
import com.xworkz.matters.mattresmodule.Mattress;
public class MattressRunner
{

        public static void display(Mattress mattress) {
            System.out.println("Mattress ID      : " + mattress.getMattressId());
            System.out.println("Brand            : " + mattress.getBrand());
            System.out.println("Size             : " + mattress.getSize());
            System.out.println("Material         : " + mattress.getMaterial());
            System.out.println("Price            : " + mattress.getPrice());
            System.out.println("Thickness (in)   : " + mattress.getThicknessInInches());
            System.out.println("Is Orthopedic?   : " + mattress.getIsOrthopedic());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Mattress m1 = new Mattress();
            m1.setMattressId(1);
            m1.setBrand("SleepWell");
            m1.setSize("Queen");
            m1.setMaterial("Memory Foam");
            m1.setPrice(15000.00);
            m1.setThicknessInInches(8);
            m1.setIsOrthopedic(true);
            display(m1);

            Mattress m2 = new Mattress();
            m2.setMattressId(2);
            m2.setBrand("Wakefit");
            m2.setSize("King");
            m2.setMaterial("Latex");
            m2.setPrice(18000.00);
            m2.setThicknessInInches(10);
            m2.setIsOrthopedic(false);
            display(m2);

            Mattress m3 = new Mattress();
            m3.setMattressId(3);
            m3.setBrand("Duroflex");
            m3.setSize("Single");
            m3.setMaterial("Coir");
            m3.setPrice(7000.00);
            m3.setThicknessInInches(6);
            m3.setIsOrthopedic(true);
            display(m3);

            Mattress m4 = new Mattress();
            m4.setMattressId(4);
            m4.setBrand("Kurlon");
            m4.setSize("Double");
            m4.setMaterial("Spring");
            m4.setPrice(12000.00);
            m4.setThicknessInInches(8);
            m4.setIsOrthopedic(false);
            display(m4);

            Mattress m5 = new Mattress();
            m5.setMattressId(5);
            m5.setBrand("Peps");
            m5.setSize("Queen");
            m5.setMaterial("Foam + Coir");
            m5.setPrice(13500.00);
            m5.setThicknessInInches(7);
            m5.setIsOrthopedic(true);
            display(m5);
        }
    }


