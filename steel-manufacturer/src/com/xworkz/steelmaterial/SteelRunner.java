package com.xworkz.steelmaterial;
import com.xworkz.steelmaterial.steel.Steel;
public class SteelRunner
{
    public  static void display(Steel type)
    {
        System.out.println("Steel Id : "+type.getSteelId());
        System.out.println("Brand Name : "+type.getBrandName());
        System.out.println("Grade : "+type.getGrade());
        System.out.println("Price : "+type.getPrice());
        System.out.println("Thickness : "+type.getThickness());
        System.out.println("Is ISI Marked : "+type.getIsIsiMarked());
        System.out.println("Owner Name : "+type.getOwnerName());
        System.out.println();
        System.out.println();

    }
    public static void main(String args[])
    {
          Steel type1=new Steel();
          type1.setSteelId(1);
          type1.setBrandName("TATA Steel");
          type1.setGrade("Fe500");
          type1.setPrice(55000.00);
          type1.setThickness(12.0);
          type1.setIsIsiMarked(true);
          type1.setOwnerName("Ramesh");
          SteelRunner.display(type1);

        Steel type2=new Steel();
        type2.setSteelId(2);
        type2.setBrandName("JSW Steel");
        type2.setGrade("Fe550D");
        type2.setPrice(58000.00);
        type2.setThickness(10.0);
        type2.setIsIsiMarked(true);
        type2.setOwnerName("Suresh");
        SteelRunner.display(type2);

        Steel type3=new Steel();
        type3.setSteelId(3);
        type3.setBrandName("SAIL");
        type3.setGrade("Fe500D");
        type3.setPrice(53000.00);
        type3.setThickness(8.0);
        type3.setIsIsiMarked(false);
        type3.setOwnerName("Mahesh");
        SteelRunner.display(type3);

        Steel type4=new Steel();
        type4.setSteelId(4);
        type4.setBrandName("Vizag Steel");
        type4.setGrade("Fe415");
        type4.setPrice(50000.00);
        type4.setThickness(6.0);
        type4.setIsIsiMarked(true);
        type4.setOwnerName("Naresh");
        SteelRunner.display(type4);

        Steel type5=new Steel();
        type5.setSteelId(5);
        type5.setBrandName("Essar Steel");
        type5.setGrade("Fe600");
        type5.setPrice(60000.00);
        type5.setThickness(16.0);
        type5.setIsIsiMarked(false);
        type5.setOwnerName("Ganesh");
        SteelRunner.display(type5);


    }
}
