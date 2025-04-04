package com.xworkz.hospital;
import com.xworkz.hospital.hospiital.Hospital;
import com.xworkz.hospital.floor.Floor;
import com.xworkz.hospital.room.Room;
import com.xworkz.hospital.patients.Patient;
public class HospitalRunner
{
    public static void main(String args[])
    {
        Hospital hospital=new Hospital();
        hospital.hospitalName="APPOLO";
        hospital.location="Bengaluru";
        hospital.noOfFloors=2;

        Floor floors[]=new Floor[hospital.noOfFloors];


        //FLOOR1
        Floor floor1=new Floor();
        floor1.floorNumber=1;
        floor1.noOfRooms=3;

        Room rooms[]=new Room[floor1.noOfRooms];
        //FLOOR1   ROOM1
        Room room1=new Room();
        room1.roomNo=1;
        room1.roomType="Duplex";
        room1.noOfPatients=1;

        Patient patients1[]=new Patient[room1.noOfPatients];

        Patient patient1=new Patient();
        patient1.setPatientId(1);
        patient1.setPatientName("Ram");
        patient1.setAdmittedDate("01-02-2025");
        patient1.setDischargeDate("21-02-2025");

        patients1[0]=patient1;

        room1.patients=patients1;
        rooms[0]=room1;

        //FLOOR1 ROOM2
        Room room2=new Room();
        room2.roomNo=2;
        room2.roomType="Semi Duplex";
        room2.noOfPatients=2;

        Patient patients2[]=new Patient[room2.noOfPatients];

        patient1=new Patient();
        patient1.setPatientId(1);
        patient1.setPatientName("Lakshmi");
        patient1.setAdmittedDate("06-01-2025");
        patient1.setDischargeDate("04-02-2025");

        Patient patient2=new Patient();
        patient2.setPatientId(2);
        patient2.setPatientName("Rekha");
        patient2.setAdmittedDate("07-08-2024");
        patient2.setDischargeDate("04-09-2024");

        patients2[0]=patient1;
        patients2[1]=patient2;

        room2.patients=patients2;

        rooms[1]=room2;

        //FLOOR1 ROOM3
        Room room3=new Room();
        room3.roomNo=3;
        room3.roomType="Generic";
        room3.noOfPatients=3;

        Patient patients3[]=new Patient[room3.noOfPatients];

        patient1=new Patient();
        patient1.setPatientId(1);
        patient1.setPatientName("Partha");
        patient1.setAdmittedDate("03-02-2025");
        patient1.setDischargeDate("09-02-2025");

        patient2=new Patient();
        patient2.setPatientId(2);
        patient2.setPatientName("Pragthi");
        patient2.setAdmittedDate("08-04-2024");
        patient2.setDischargeDate("12-04-2024");

        Patient  patient3=new Patient();
        patient3.setPatientId(3);
        patient3.setPatientName("Prithvi");
        patient3.setAdmittedDate("08-04-2024");
        patient3.setDischargeDate("08-04-2024");

        patients3[0]=patient1;
        patients3[1]=patient2;
        patients3[2]=patient3;

        room3.patients=patients3;

        rooms[2]=room3;

        floor1.rooms=rooms;

        floors[0]=floor1;


        //FLOOR2
        Floor floor2=new Floor();
        floor2.floorNumber=2;
        floor2.noOfRooms=3;
        floor1=new Floor();
        floor1.floorNumber=2;
        floor1.noOfRooms=3;

        Room rooms2[]=new Room[floor1.noOfRooms];
        //FLOOR2   ROOM1
        room1=new Room();
        room1.roomNo=1;
        room1.roomType="Duplex";
        room1.noOfPatients=1;

        Patient patients21[]=new Patient[room1.noOfPatients];

        patient1=new Patient();
        patient1.setPatientId(1);
        patient1.setPatientName("Rani");
        patient1.setAdmittedDate("03-02-2025");
        patient1.setDischargeDate("21-02-2025");

        patients21[0]=patient1;

        room1.patients=patients21;
        rooms2[0]=room1;

        //FLOOR2 ROOM2
        room2=new Room();
        room2.roomNo=2;
        room2.roomType="Semi Duplex";
        room2.noOfPatients=2;

        Patient patients22[]=new Patient[room2.noOfPatients];

        patient1=new Patient();
        patient1.setPatientId(1);
        patient1.setPatientName("Raksha");
        patient1.setAdmittedDate("09-01-2025");
        patient1.setDischargeDate("04-02-2025");

        patient2=new Patient();
        patient2.setPatientId(2);
        patient2.setPatientName("Rama");
        patient2.setAdmittedDate("05-08-2024");
        patient2.setDischargeDate("09-09-2024");

        patients22[0]=patient1;
        patients22[1]=patient2;

        room2.patients=patients22;

        rooms2[1]=room2;

        //FLOOR2 ROOM3
        room3=new Room();
        room3.roomNo=3;
        room3.roomType="Generic";
        room3.noOfPatients=3;

        Patient patients23[]=new Patient[room3.noOfPatients];

        patient1=new Patient();
        patient1.setPatientId(1);
        patient1.setPatientName("Putti");
        patient1.setAdmittedDate("03-04-2025");
        patient1.setDischargeDate("09-05-2025");

        patient2=new Patient();
        patient2.setPatientId(2);
        patient2.setPatientName("Pragna");
        patient2.setAdmittedDate("12-04-2024");
        patient2.setDischargeDate("13-04-2024");

         patient3=new Patient();
        patient3.setPatientId(3);
        patient3.setPatientName("Pankaj");
        patient3.setAdmittedDate("16-04-2024");
        patient3.setDischargeDate("17-04-2024");

        patients23[0]=patient1;
        patients23[1]=patient2;
        patients23[2]=patient3;

        room3.patients=patients23;

        rooms2[2]=room3;

        floor2.rooms=rooms2;

        floors[1]=floor2;


        hospital.floors=floors;

        hospital.getHospitalInfo();














    }
}
