package com.xworkz.ladderr;
import com.xworkz.ladderr.ladermodule.Ladder;
public class LadderRunner
{
     public static void display(Ladder ladder) {
            System.out.println("Ladder ID      : " + ladder.getLadderId());
            System.out.println("Brand          : " + ladder.getBrand());
            System.out.println("Height (ft)    : " + ladder.getHeightInFeet());
            System.out.println("Material       : " + ladder.getMaterial());
            System.out.println("Steps          : " + ladder.getSteps());
            System.out.println("Is Foldable?   : " + ladder.getIsFoldable());
            System.out.println("Owner Name     : " + ladder.getOwnerName());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Ladder l1 = new Ladder();
            l1.setLadderId(1);
            l1.setBrand("StepUp");
            l1.setHeightInFeet(6.5);
            l1.setMaterial("Aluminium");
            l1.setSteps(5);
            l1.setIsFoldable(true);
            l1.setOwnerName("Ravi");
            display(l1);

            Ladder l2 = new Ladder();
            l2.setLadderId(2);
            l2.setBrand("SafeClimb");
            l2.setHeightInFeet(8.0);
            l2.setMaterial("Steel");
            l2.setSteps(7);
            l2.setIsFoldable(false);
            l2.setOwnerName("Meena");
            display(l2);

            Ladder l3 = new Ladder();
            l3.setLadderId(3);
            l3.setBrand("SkyReach");
            l3.setHeightInFeet(10.0);
            l3.setMaterial("Fiberglass");
            l3.setSteps(9);
            l3.setIsFoldable(true);
            l3.setOwnerName("Shiva");
            display(l3);

            Ladder l4 = new Ladder();
            l4.setLadderId(4);
            l4.setBrand("SturdyStep");
            l4.setHeightInFeet(5.0);
            l4.setMaterial("Wood");
            l4.setSteps(4);
            l4.setIsFoldable(false);
            l4.setOwnerName("Anjali");
            display(l4);

            Ladder l5 = new Ladder();
            l5.setLadderId(5);
            l5.setBrand("TopReach");
            l5.setHeightInFeet(7.5);
            l5.setMaterial("Aluminium");
            l5.setSteps(6);
            l5.setIsFoldable(true);
            l5.setOwnerName("Kiran");
            display(l5);
        }
    }


