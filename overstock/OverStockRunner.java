package com.xworkz.tostring.overstock;

public class OverStockRunner
{
    public static void main(String[] args) {

        OverStockDto user = new OverStockDto();
        user.setOverStockId("overstock2025");
        user.setUserName("Tarun");
        user.setEmail("tarun@overstock.com");
        user.setPassword("stock@2025");
        user.setConfirmPassword("stock@2025");
        user.setContactNumber(9876701234L);

        System.out.println(user);
    }

}
