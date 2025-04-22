package com.xworkz.tostring.bigbasket;

public class BigBasketRunner
{
    public static void main(String[] args) {

        BigBasketDto user = new BigBasketDto();
        user.setBigbasketId("bigbasket2025");
        user.setUserName("Riya");
        user.setEmail("riya@bigbasket.com");
        user.setPassword("big@2025");
        user.setConfirmPassword("big@2025");
        user.setContactNumber(9876589012L);

        System.out.println(user);
    }
}
