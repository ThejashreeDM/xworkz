package com.xworkz.crop;
import com.xworkz.crop.cropmodule.Crop;
public class CropRunner
{
      public static void display(Crop crop) {
            System.out.println("Crop ID         : " + crop.getCropId());
            System.out.println("Crop Name       : " + crop.getCropName());
            System.out.println("Season          : " + crop.getSeason());
            System.out.println("Soil Type       : " + crop.getSoilType());
            System.out.println("Price per Kg    : " + crop.getPricePerKg());
            System.out.println("Duration (Days) : " + crop.getDurationInDays());
            System.out.println("Farmer Name     : " + crop.getFarmerName());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Crop crop1 = new Crop();
            crop1.setCropId(1);
            crop1.setCropName("Ragi");
            crop1.setSeason("Kharif");
            crop1.setSoilType("Red Soil");
            crop1.setPricePerKg(25.50);
            crop1.setDurationInDays(120);
            crop1.setFarmerName("Ravi");
            display(crop1);

            Crop crop2 = new Crop();
            crop2.setCropId(2);
            crop2.setCropName("Sugarcane");
            crop2.setSeason("Annual");
            crop2.setSoilType("Loamy");
            crop2.setPricePerKg(3.00);
            crop2.setDurationInDays(300);
            crop2.setFarmerName("Meena");
            display(crop2);

            Crop crop3 = new Crop();
            crop3.setCropId(3);
            crop3.setCropName("Wheat");
            crop3.setSeason("Rabi");
            crop3.setSoilType("Alluvial");
            crop3.setPricePerKg(28.00);
            crop3.setDurationInDays(140);
            crop3.setFarmerName("Shiva");
            display(crop3);

            Crop crop4 = new Crop();
            crop4.setCropId(4);
            crop4.setCropName("Paddy");
            crop4.setSeason("Kharif");
            crop4.setSoilType("Clayey");
            crop4.setPricePerKg(22.00);
            crop4.setDurationInDays(130);
            crop4.setFarmerName("Anjali");
            display(crop4);

            Crop crop5 = new Crop();
            crop5.setCropId(5);
            crop5.setCropName("Maize");
            crop5.setSeason("Zaid");
            crop5.setSoilType("Sandy Loam");
            crop5.setPricePerKg(18.00);
            crop5.setDurationInDays(100);
            crop5.setFarmerName("Kiran");
            display(crop5);
        }
    }


