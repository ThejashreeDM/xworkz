package com.xworkz.inheritancemodule.medicine;

public class AyurvedaRunner
{
    public static void main(String[] args) {
        Medicine medicine=new Ayurveda();
        Ayurveda ayurvedaMedicine=(Ayurveda)medicine;
        ayurvedaMedicine.treatDisease();
    }
}
