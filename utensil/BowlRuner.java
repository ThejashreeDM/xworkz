package com.xworkz.inheritancemodule.utensil;

public class BowlRuner
{
    public static void main(String args[]) {

        Utensil utensil = new Utensil();
        Utensil bowlAsUtensil = new Bowl();
        Bowl bowl = new Bowl();
        utensil.store();
        utensil.clean();
        utensil.serve();
        utensil.maintain();
        utensil.dispose();
        bowlAsUtensil.store();
        bowlAsUtensil.clean();
        bowlAsUtensil.serve();
        bowlAsUtensil.maintain();
        bowlAsUtensil.dispose();
        bowl.holdFood();
        bowl.serveSoup();
        bowl.stack();
        bowl.microwaveSafe();
        bowl.decorate();
    }
}
