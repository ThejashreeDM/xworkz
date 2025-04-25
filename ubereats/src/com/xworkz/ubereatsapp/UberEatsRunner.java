package com.xworkz.ubereatsapp;
import com.xworkz.ubereatsapp.userdata.UberEatsUserDto;
import com.xworkz.ubereatsapp.signup.UberEats;
public class UberEatsRunner
{

        public static void main(String[] args) {
            UberEatsUserDto user1 = new UberEatsUserDto();
            user1.setEmail("foodie@example.com");
            user1.setPhoneNumber("9998887776");
            user1.setFullName("Priya Sharma");
            user1.setPassword("YummyFood@2024");
            user1.setDeliveryAddress("HSR Layout, Bangalore");

            UberEatsUserDto user2 = new UberEatsUserDto();
            user2.setEmail("foodie@example.com");
            user2.setPhoneNumber("9998887776");
            user2.setFullName("Priya Sharma");
            user2.setPassword("YummyFood@2024");
            user2.setDeliveryAddress("HSR Layout, Bangalore");

            UberEatsUserDto user3= new UberEatsUserDto();
            user3.setEmail("food@example.com");
            user3.setPhoneNumber("9998867776");
            user3.setFullName("Prithvi Sharma");
            user3.setPassword("Food@2024");
            user3.setDeliveryAddress("HSR Layout");

            UberEats uberEats = new UberEats();
            if (uberEats.userSignUp(user1)) {
                System.out.println("UberEats Registration Successful!");
            } else {
                System.out.println("UberEats Registration Failed!");
            }
            System.out.println(user1);
            System.out.println(user1.equals(user2));
            System.out.println(user2.equals(user3));
        }
    }


