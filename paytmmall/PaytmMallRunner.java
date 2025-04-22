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

        System.out.println(user);
    }
}
