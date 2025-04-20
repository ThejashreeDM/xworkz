package com.xworkz.inheritancemodule.medicine;

public class Ayurveda extends Medicine
{
    @Override
    public void treatDisease()
    {
        System.out.println("Ayurveda Medicines are used to treat diseases");
    }
    @Override
    public void diagnose() {
        System.out.println("Diagnosing the patient's condition while treatin with ayurvedic medicine");
    }
    @Override
    public void prescribe() {
        System.out.println("Prescribing ayurvedic medicine to the patient");
    }
    @Override
    public void treat() {
        System.out.println("Treating the patient with appropriate ayurvedic medicine");
    }
    @Override
    public void monitor() {
        System.out.println("Monitoring the patient's progress by treating with ayurvedic medicine");
    }
    @Override
    public void dispense() {
        System.out.println("Dispensing ayurvedic medicine to the patient.");
    }
    public void prepareHerbalRemedies() {
        System.out.println("Preparing herbal remedies for the patient.");
    }

    public void balanceDoshas() {
        System.out.println("Balancing the doshas through Ayurvedic treatments.");
    }

    public void offerPanchakarma() {
        System.out.println("Offering Panchakarma treatment for detoxification.");
    }

    public void recommendDiet() {
        System.out.println("Recommending a diet based on Ayurvedic principles.");
    }

    public void performMarmaTherapy() {
        System.out.println("Performing Marma therapy for healing energy points.");
    }
}
