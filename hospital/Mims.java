package com.xworkz.inheritancemodule.hospital;

public class Mims extends Hospital
{

     @Override
    public void treat()
    {
        System.out.println("Mims Hospital purpose is to treat");
    }
    @Override
    public void admitPatient() {
        System.out.println("Admitting a patient to the Mims hospital");
    }
    @Override
    public void diagnose() {
        System.out.println("Diagnosing the patient's condition in Mims hspital");
    }
    @Override
    public void provideTreatment() {
        System.out.println("Providing treatment to the patient in Mims Hospital");
    }
    @Override
    public void dischargePatient() {
        System.out.println("Discharging the patient from the Mims hospital");
    }
    @Override
    public void scheduleFollowUp() {
        System.out.println("Scheduling a follow-up appointment in Mims Hospital");
    }

    public void provideEmergencyCare() {
        System.out.println("Providing emergency care to patients.");
    }

    public void conductSurgery() {
        System.out.println("Conducting surgery for critical patients.");
    }

    public void runLaboratoryTests() {
        System.out.println("Running laboratory tests for diagnosis.");
    }

    public void manageICU() {
        System.out.println("Managing the Intensive Care Unit (ICU).");
    }

    public void offerSpecializedConsultation() {
        System.out.println("Offering specialized consultation in various fields.");
    }
}
