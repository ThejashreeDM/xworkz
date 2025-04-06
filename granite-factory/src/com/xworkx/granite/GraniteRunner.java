package com.xworkx.granite;
import com.xworkx.granite.granitemodule.Granite;
public class GraniteRunner
{
    public static void display(Granite granite) {
        System.out.println("Granite Id : "+granite.getGraniteId());
        System.out.println("Granite Brand Name : "+granite.getBrandName());
        System.out.println("Granite Size : "+granite.getSize());
        System.out.println("Granite Color : "+granite.getColor());
        System.out.println("Granite Price : "+granite.getColor());
        System.out.println("Granite Style : "+granite.getStyle());
        System.out.println("Granite Owner : "+granite.getOwnerName());
        System.out.println();
        System.out.println();

    }

    public static void main(String args[])
    {
        Granite type1=new Granite();
        type1.setGraniteId(1);
        type1.setBrandName("Classic Granites");
        type1.setSize("2*2");
        type1.setColor("Black");
        type1.setPrice(1200.00);
        type1.setStyle("Glossy");
        type1.setOwnerName("Ravi");
        GraniteRunner.display(type1);

        Granite type2=new Granite();
        type2.setGraniteId(2);
        type2.setBrandName("Royal Stone");
        type2.setSize("3*3");
        type2.setColor("Gray");
        type2.setPrice(1500.00);
        type2.setStyle("Matte");
        type2.setOwnerName("Meena");
        GraniteRunner.display(type2);

        Granite type3=new Granite();
        type3.setGraniteId(3);
        type3.setBrandName("Everest Granite");
        type3.setSize("2*4");
        type3.setColor("White");
        type3.setPrice(1000.00);
        type3.setStyle("Leather");
        type3.setOwnerName("Shiva");
        GraniteRunner.display(type3);

        Granite type4=new Granite();
        type4.setGraniteId(4);
        type4.setBrandName("Everest Granite");
        type4.setSize("2*4");
        type4.setColor("White");
        type4.setPrice(1000.00);
        type4.setStyle("Leather");
        type4.setOwnerName("Shiva");
        GraniteRunner.display(type4);

        Granite type5=new Granite();
        type5.setGraniteId(5);
        type5.setBrandName("Stone Craft");
        type5.setSize("3*2");
        type5.setColor("Brown");
        type5.setPrice(1300.00);
        type5.setStyle("Flamed");
        type5.setOwnerName("Arjun");
        GraniteRunner.display(type5);
     }
}
