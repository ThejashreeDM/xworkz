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

        OverStockDto user1 = new OverStockDto();
        user1.setOverStockId("overstock2025");
        user1.setUserName("Tarun");
        user1.setEmail("tarun@overstock.com");
        user1.setPassword("stock@2025");
        user1.setConfirmPassword("stock@2025");
        user1.setContactNumber(9876701234L);

        OverStockDto user2 = new OverStockDto();
        user2.setOverStockId("overstock2018");
        user2.setUserName("Tushar");
        user2.setEmail("tushar@overstock.com");
        user2.setPassword("stock@2018");
        user2.setConfirmPassword("stock@2018");
        user2.setContactNumber(9876102634L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }

}
