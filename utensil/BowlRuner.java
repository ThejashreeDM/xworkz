package com.xworkz.inheritancemodule.utensil;

public class BowlRuner
{
    public static void main(String args[])
   {
         Utensil bowl=new Bowl();
         Bowl type1=(Bowl)bowl;
         type1.store();
   }
}
