package com.xworkz.markerr;
import com.xworkz.markerr.markermodule.Marker;
public class MarkerRunner
{

        public static void display(Marker marker) {
            System.out.println("Marker ID       : " + marker.getMarkerId());
            System.out.println("Brand Name      : " + marker.getBrandName());
            System.out.println("Ink Color       : " + marker.getInkColor());
            System.out.println("Type            : " + marker.getType());
            System.out.println("Price           : " + marker.getPrice());
            System.out.println("Refillable      : " + marker.getIsRefillable());
            System.out.println("Owner Name      : " + marker.getOwnerName());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Marker marker1 = new Marker();
            marker1.setMarkerId(101);
            marker1.setBrandName("Camlin");
            marker1.setInkColor("Blue");
            marker1.setType("Permanent");
            marker1.setPrice(50.00);
            marker1.setIsRefillable(true);
            marker1.setOwnerName("Ravi");
            display(marker1);

            Marker marker2 = new Marker();
            marker2.setMarkerId(102);
            marker2.setBrandName("Faber-Castell");
            marker2.setInkColor("Black");
            marker2.setType("Whiteboard");
            marker2.setPrice(60.00);
            marker2.setIsRefillable(false);
            marker2.setOwnerName("Meena");
            display(marker2);

            Marker marker3 = new Marker();
            marker3.setMarkerId(103);
            marker3.setBrandName("Reynolds");
            marker3.setInkColor("Red");
            marker3.setType("Sketch");
            marker3.setPrice(40.00);
            marker3.setIsRefillable(false);
            marker3.setOwnerName("Shiva");
            display(marker3);

            Marker marker4 = new Marker();
            marker4.setMarkerId(104);
            marker4.setBrandName("Luxor");
            marker4.setInkColor("Green");
            marker4.setType("Permanent");
            marker4.setPrice(55.00);
            marker4.setIsRefillable(true);
            marker4.setOwnerName("Arjun");
            display(marker4);

            Marker marker5 = new Marker();
            marker5.setMarkerId(105);
            marker5.setBrandName("Pilot");
            marker5.setInkColor("Purple");
            marker5.setType("Gel");
            marker5.setPrice(70.00);
            marker5.setIsRefillable(true);
            marker5.setOwnerName("Priya");
            display(marker5);
        }
    }


