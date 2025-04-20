package com.xworkz.inheritancemodule.medicine;

public class AyurvedaRunner
{
    public static void main(String[] args)
    {
        Medicine medicine = new Medicine();
        Medicine ayurvedaMedicine = new Ayurveda();
        Ayurveda ayurvedic = new Ayurveda();
        medicine.diagnose();
        medicine.prescribe();
        medicine.treatDisease();
        medicine.treat();
        medicine.dispense();
        ayurvedaMedicine.diagnose();
        ayurvedaMedicine.prescribe();
        ayurvedaMedicine.treatDisease();
        ayurvedaMedicine.dispense();
        ayurvedaMedicine.treat();
        ayurvedic.diagnose();
        ayurvedic.prescribe();
        ayurvedic.treatDisease();
        ayurvedic.treat();
        ayurvedic. dispense();
        ayurvedic.balanceDoshas();
        ayurvedic.recommendDiet();
        ayurvedic.offerPanchakarma();
        ayurvedic.prepareHerbalRemedies();
        ayurvedic. performMarmaTherapy();
    }
}
