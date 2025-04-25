package com.xworkz.ajioapp;
import com.xworkz.ajioapp.userdata.AjioUserDto;
import com.xworkz.ajioapp.signup.Ajio;
public class AjioRunner
{

        public static void main(String[] args) {
            AjioUserDto user = new AjioUserDto();
            user.setEmail("fashionista@ajio.com");
            user.setMobileNumber("9876543210");
            user.setPassword("Ajio@2025");
            user.setFullName("Ananya Rao");
            user.setGender("Female");

            AjioUserDto user2 = new AjioUserDto();
            user2.setEmail("fashionista@ajio.com");
            user2.setMobileNumber("9876543210");
            user2.setPassword("Ajio@2025");
            user2.setFullName("Ananya Rao");
            user2.setGender("Female");

            AjioUserDto user3 = new AjioUserDto();
            user3.setEmail("fashion@ajio.com");
            user3.setMobileNumber("9826543210");
            user3.setPassword("Ajio@2023");
            user3.setFullName("Ananya Ram");
            user3.setGender("Female");

            Ajio ajio = new Ajio();
            if (ajio.userSignUp(user)) {
                System.out.println("Ajio Registration Successful!");
            } else {
                System.out.println("Ajio Registration Failed!");
            }
            System.out.println(user);
            System.out.println(user.equals(user2));
            System.out.println(user2.equals(user3));

        }
    }


