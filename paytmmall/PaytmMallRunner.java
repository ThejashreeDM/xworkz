package com.xworkz.tostring.paytmmall;

public class PaytmMallRunner
{
    public static void main(String[] args) {

        PaytmMallDto user = new PaytmMallDto();
        user.setPaytmMallId("paytmmall2025");
        user.setUserName("Kiran");
        user.setEmail("kiran@paytmmall.com");
        user.setPassword("paytm@2025");
        user.setConfirmPassword("paytm@2025");
        user.setContactNumber(9876656789L);

        PaytmMallDto user1 = new PaytmMallDto();
        user1.setPaytmMallId("paytmmall2025");
        user1.setUserName("Kiran");
        user1.setEmail("kiran@paytmmall.com");
        user1.setPassword("paytm@2025");
        user1.setConfirmPassword("paytm@2025");
        user1.setContactNumber(9876656789L);

        PaytmMallDto user2 = new PaytmMallDto();
        user2.setPaytmMallId("paytmmall2013");
        user2.setUserName("Kiara");
        user2.setEmail("kiara@paytmmall.com");
        user2.setPassword("paytm@2013");
        user2.setConfirmPassword("paytm@2013");
        user2.setContactNumber(8876656789L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}
