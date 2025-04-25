package com.xworkz.blinkitapp;
import com.xworkz.blinkitapp.userdata.BlinkitUserDto;
import com.xworkz.blinkitapp.signup.Blinkit;
public class BlinkitRunner
{

        public static void main(String[] args) {
            BlinkitUserDto user1 = new BlinkitUserDto();
            user1.setEmail("quickgroceries@blinkit.com");
            user1.setPhoneNumber("9001122334");
            user1.setPassword("Blinkit@2025");
            user1.setFullName("Sneha Verma");
            user1.setDeliveryAddress("JP Nagar, Bangalore");

            BlinkitUserDto user2 = new BlinkitUserDto();
            user2.setEmail("quickgroceries@blinkit.com");
            user2.setPhoneNumber("9001122334");
            user2.setPassword("Blinkit@2025");
            user2.setFullName("Sneha Verma");
            user2.setDeliveryAddress("JP Nagar, Bangalore");

            BlinkitUserDto user3= new BlinkitUserDto();
            user3.setEmail("quickgroceries@blinkit.com");
            user3.setPhoneNumber("9001122334");
            user3.setPassword("Blinkit@2025");
            user3.setFullName("Sneha Verma");
            user3.setDeliveryAddress("JP Nagar, Bangalore");

            Blinkit blinkit = new Blinkit();
            if (blinkit.userSignUp(user1)) {
                System.out.println("Blinkit Registration Successful!");
            } else {
                System.out.println("Blinkit Registration Failed!");
            }
            System.out.println(user1);
            System.out.println(user1.equals(user2));
            System.out.println(user2.equals(user3));
        }
    }


