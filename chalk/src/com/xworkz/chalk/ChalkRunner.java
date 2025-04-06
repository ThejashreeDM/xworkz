package com.xworkz.chalk;
import com.xworkz.chalk.chalkk.Chalk;
public class ChalkRunner
{

        public static void display(Chalk chalk) {
            System.out.println("Chalk ID        : " + chalk.getChalkId());
            System.out.println("Brand           : " + chalk.getBrand());
            System.out.println("Color           : " + chalk.getColor());
            System.out.println("Shape           : " + chalk.getShape());
            System.out.println("Length (cm)     : " + chalk.getLengthInCm());
            System.out.println("Is Dust Free?   : " + chalk.getIsDustFree());
            System.out.println("Material        : " + chalk.getMaterial());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Chalk c1 = new Chalk();
            c1.setChalkId(1);
            c1.setBrand("ClassMate");
            c1.setColor("White");
            c1.setShape("Cylindrical");
            c1.setLengthInCm(7.0);
            c1.setIsDustFree(true);
            c1.setMaterial("Calcium Carbonate");
            display(c1);

            Chalk c2 = new Chalk();
            c2.setChalkId(2);
            c2.setBrand("Camlin");
            c2.setColor("Yellow");
            c2.setShape("Square");
            c2.setLengthInCm(6.5);
            c2.setIsDustFree(false);
            c2.setMaterial("Gypsum");
            display(c2);

            Chalk c3 = new Chalk();
            c3.setChalkId(3);
            c3.setBrand("Apsara");
            c3.setColor("Blue");
            c3.setShape("Round");
            c3.setLengthInCm(6.0);
            c3.setIsDustFree(true);
            c3.setMaterial("Calcium Sulfate");
            display(c3);

            Chalk c4 = new Chalk();
            c4.setChalkId(4);
            c4.setBrand("Navneet");
            c4.setColor("Green");
            c4.setShape("Cylindrical");
            c4.setLengthInCm(7.5);
            c4.setIsDustFree(false);
            c4.setMaterial("Plaster of Paris");
            display(c4);

            Chalk c5 = new Chalk();
            c5.setChalkId(5);
            c5.setBrand("Faber-Castell");
            c5.setColor("Pink");
            c5.setShape("Flat");
            c5.setLengthInCm(6.8);
            c5.setIsDustFree(true);
            c5.setMaterial("Natural Chalk");
            display(c5);
        }
    }


