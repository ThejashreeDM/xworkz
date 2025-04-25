package com.xworkz.zeptoapp;
import com.xworkz.zeptoapp.userdata.ZeptoUserDto;
import com.xworkz.zeptoapp.signup.Zepto;
public class ZeptoRunner
{
    public static void main(String[] args) {
        ZeptoUserDto user1 = new ZeptoUserDto();
        user1.setEmail("user@zepto.com");
        user1.setPhoneNumber("9876543210");
        user1.setName("Ananya R");
        user1.setPassword("Groceries@123");
        user1.setAddress("12th Cross, JP Nagar, Bangalore");

        ZeptoUserDto user2 = new ZeptoUserDto();
        user2.setEmail("user@zepto.com");
        user2.setPhoneNumber("9876543210");
        user2.setName("Ananya R");
        user2.setPassword("Groceries@123");
        user2.setAddress("12th Cross, JP Nagar, Bangalore");

        ZeptoUserDto user3 = new ZeptoUserDto();
        user3.setEmail("user3@zepto.com");
        user3.setPhoneNumber("9876543345");
        user3.setName("Lavanya K");
        user3.setPassword("Lavanya@123");
        user3.setAddress("6th block Rajajinagar, Bangalore");

        Zepto zepto = new Zepto();
        if (zepto.userSignUp(user1)) {
            System.out.println("Zepto User Registration Successful");
        }
        else {
            System.out.println("Zepto User Registration Failed");
        }
        System.out.println(user1);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));
    }
}
