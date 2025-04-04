package com.xworkz.hospital.room;
import com.xworkz.hospital.patients.Patient;
public class Room
{
    public int roomNo;
    public String roomType;
    public int noOfPatients;
    public Patient patients[];

    public void getRoomInfo()
    {
        System.out.println("Room Number : "+roomNo);
        System.out.println("Room Type : "+roomType);
        System.out.println("Number of Patients : "+noOfPatients);
        System.out.println();
        System.out.println("Patients : ");
        System.out.println();
        for(Patient patient:patients)
        {

            System.out.println();
            System.out.println("Patient Id : "+patient.getPatieniId());
            System.out.println("Patient Name : "+patient.getPatientName());
            System.out.println("Admitted Date : "+patient.getAdmittedDate());
            System.out.println("Discharge Date : "+patient.getDischargeDate());
            System.out.println();
        }

    }

}
