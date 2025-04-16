package com.xworkz.inheritancemodule.hospital;

public class HospitalRunner
{
    public static void main(String args[])
    {
        Hospital hospital = new Hospital();
        Hospital mimsHospital = new Mims();
        Mims mims = new Mims();
        hospital.admitPatient();
        hospital.provideTreatment();
        hospital.diagnose();
        hospital.dischargePatient();
        hospital.scheduleFollowUp();
        mimsHospital.admitPatient();
        mimsHospital.provideTreatment();
        mimsHospital.diagnose();
        mimsHospital.dischargePatient();
        mimsHospital.scheduleFollowUp();
        mims.conductSurgery();
        mims.manageICU();
        mims.runLaboratoryTests();
        mims.offerSpecializedConsultation();
        mims.provideEmergencyCare();
    }
}
