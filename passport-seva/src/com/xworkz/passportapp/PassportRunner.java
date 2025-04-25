package com.xworkz.passportapp;
import com.xworkz.passportapp.constants.CpvLocation;
import com.xworkz.passportapp.constants.Location;
import com.xworkz.passportapp.passport.PassportDto;
import com.xworkz.passportapp.generatepassport.Passport;
public class PassportRunner
{
    public static void main(String args[])
    {
        PassportDto user1=new PassportDto();
        user1.setCpvLocation(CpvLocation.PASSPORT_OFFICE);
        user1.setDcdrLocation(Location.BANGLORE);
        user1.setGivenName("Baba");
        user1.setSurName("Ram Dev");
        user1.setDob("12-12-1890");
        user1.setEmail("baba@gmail.com");
        user1.setEmailLoginSame(true);
        user1.setLoginId("baba@gmail.com");
        user1.setPassword("baba@123");
        user1.setConfirmPassword("baba@123");
        user1.setHintQues("Your favorite color");
        user1.setHintAns("Pink");
        user1.setCaptcha("DNBGC123");

        PassportDto user2=new PassportDto();
        user2.setCpvLocation(CpvLocation.PASSPORT_OFFICE);
        user2.setDcdrLocation(Location.BANGLORE);
        user2.setGivenName("Baba");
        user2.setSurName("Ram Dev");
        user2.setDob("12-12-1890");
        user2.setEmail("baba@gmail.com");
        user2.setEmailLoginSame(true);
        user2.setLoginId("baba@gmail.com");
        user2.setPassword("baba@123");
        user2.setConfirmPassword("baba@123");
        user2.setHintQues("Your favorite color");
        user2.setHintAns("Pink");
        user2.setCaptcha("DNBGC123");

        PassportDto user3=new PassportDto();
        user3.setCpvLocation(CpvLocation.PASSPORT_OFFICE);
        user3.setDcdrLocation(Location.BANGLORE);
        user3.setGivenName("Babu");
        user3.setSurName("Ram ");
        user3.setDob("11-11-1895");
        user3.setEmail("babu@gmail.com");
        user3.setEmailLoginSame(true);
        user3.setLoginId("babu@gmail.com");
        user3.setPassword("babu@123");
        user3.setConfirmPassword("babu@123");
        user3.setHintQues("Your favorite color");
        user3.setHintAns("Red");
        user3.setCaptcha("ABCDE678");

        Passport validateUser1=new Passport();
       if(validateUser1.validateUser(user1))
           System.out.println("User Registration Successfull");
       else
           System.out.println("User Registration Unsuccessfull");

        System.out.println(user1);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));





    }
}
