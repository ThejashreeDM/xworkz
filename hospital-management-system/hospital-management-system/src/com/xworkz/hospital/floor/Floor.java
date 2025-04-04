package com.xworkz.hospital.floor;

import com.xworkz.hospital.room.Room;

public class Floor
{
    public int floorNumber;
    public int noOfRooms;
    public Room rooms[];

    public void getFloorInfo()
    {
        System.out.println("Floor Number : "+floorNumber);
        System.out.println("Number of Rooms : "+noOfRooms);
        for(Room room : rooms)
        {

                room.getRoomInfo();
                System.out.println();


        }
    }

}
