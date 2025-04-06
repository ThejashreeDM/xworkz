package com.xworkz.mobilecasee;
import com.xworkz.mobilecasee.mobilecasemodule.MobileCase;
public class MobileCaseRunner
{
        public static void display(MobileCase mobileCase) {
            System.out.println("Case ID             : " + mobileCase.getCaseId());
            System.out.println("Brand               : " + mobileCase.getBrand());
            System.out.println("Model Compatible    : " + mobileCase.getModelCompatible());
            System.out.println("Material            : " + mobileCase.getMaterial());
            System.out.println("Color               : " + mobileCase.getColor());
            System.out.println("Price               : " + mobileCase.getPrice());
            System.out.println("Is Water Resistant? : " + mobileCase.getIsWaterResistant());
            System.out.println();
        }

        public static void main(String[] args)
        {
            MobileCase case1 = new MobileCase();
            case1.setCaseId(1);
            case1.setBrand("Spigen");
            case1.setModelCompatible("iPhone 14");
            case1.setMaterial("TPU");
            case1.setColor("Black");
            case1.setPrice(799.00);
            case1.setIsWaterResistant(true);
            display(case1);

            MobileCase case2 = new MobileCase();
            case2.setCaseId(2);
            case2.setBrand("OtterBox");
            case2.setModelCompatible("Samsung S23");
            case2.setMaterial("Polycarbonate");
            case2.setColor("Blue");
            case2.setPrice(1499.00);
            case2.setIsWaterResistant(true);
            display(case2);

            MobileCase case3 = new MobileCase();
            case3.setCaseId(3);
            case3.setBrand("Ringke");
            case3.setModelCompatible("OnePlus 11");
            case3.setMaterial("Silicone");
            case3.setColor("Green");
            case3.setPrice(499.00);
            case3.setIsWaterResistant(false);
            display(case3);

            MobileCase case4 = new MobileCase();
            case4.setCaseId(4);
            case4.setBrand("Caseology");
            case4.setModelCompatible("iPhone 13");
            case4.setMaterial("Leather");
            case4.setColor("Brown");
            case4.setPrice(999.00);
            case4.setIsWaterResistant(false);
            display(case4);

            MobileCase case5 = new MobileCase();
            case5.setCaseId(5);
            case5.setBrand("Urban Armor Gear");
            case5.setModelCompatible("Pixel 7");
            case5.setMaterial("Hybrid");
            case5.setColor("Grey");
            case5.setPrice(1299.00);
            case5.setIsWaterResistant(true);
            display(case5);
        }
    }


