package com.xworkz.majigee;
import com.xworkz.majigee.majigemodule.Majige;
public class MajigeRunner
{
     public static void display(Majige majige) {
            System.out.println("Majige ID     : " + majige.getMajigeId());
            System.out.println("Brand Name    : " + majige.getBrandName());
            System.out.println("Price         : " + majige.getPrice());
            System.out.println("Flavor        : " + majige.getFlavor());
            System.out.println("Quantity (ml) : " + majige.getQuantity());
            System.out.println("Is Chilled?   : " + majige.getIsChilled());
            System.out.println("Owner Name    : " + majige.getOwnerName());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Majige m1 = new Majige();
            m1.setMajigeId(1);
            m1.setBrandName("Nandini");
            m1.setPrice(15.00);
            m1.setFlavor("Plain");
            m1.setQuantity(200);
            m1.setIsChilled(true);
            m1.setOwnerName("Ravi");
            display(m1);

            Majige m2 = new Majige();
            m2.setMajigeId(2);
            m2.setBrandName("Heritage");
            m2.setPrice(18.00);
            m2.setFlavor("Masala");
            m2.setQuantity(250);
            m2.setIsChilled(true);
            m2.setOwnerName("Meena");
            display(m2);

            Majige m3 = new Majige();
            m3.setMajigeId(3);
            m3.setBrandName("Amul");
            m3.setPrice(20.00);
            m3.setFlavor("Mint");
            m3.setQuantity(300);
            m3.setIsChilled(false);
            m3.setOwnerName("Shiva");
            display(m3);

            Majige m4 = new Majige();
            m4.setMajigeId(4);
            m4.setBrandName("Aavin");
            m4.setPrice(16.00);
            m4.setFlavor("Ginger");
            m4.setQuantity(200);
            m4.setIsChilled(true);
            m4.setOwnerName("Anjali");
            display(m4);

            Majige m5 = new Majige();
            m5.setMajigeId(5);
            m5.setBrandName("Dodla");
            m5.setPrice(14.00);
            m5.setFlavor("Plain");
            m5.setQuantity(180);
            m5.setIsChilled(false);
            m5.setOwnerName("Kiran");
            display(m5);
        }
    }


