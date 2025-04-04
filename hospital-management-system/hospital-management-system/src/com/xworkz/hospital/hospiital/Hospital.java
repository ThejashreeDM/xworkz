package com.xworkz.hospital.hospiital;
import com.xworkz.hospital.floor.Floor;
public class Hospital
{

    public String hospitalName;
    public String location;
    public int noOfFloors;
    public Floor floors[];

    public void getHospitalInfo()
    {
        System.out.println("Hospital Name : "+hospitalName);
        System.out.println("Hospital Location : "+location);
        System.out.println("Number of Floors : "+noOfFloors);
        for(Floor floor : floors) {
            floor.getFloorInfo();
            System.out.println();
            System.out.println();
        }

    }

}
