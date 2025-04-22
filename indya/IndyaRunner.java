package com.xworkz.tostring.indya;

public class IndyaRunner
{
    public static void main(String[] args) {

        IndyaDto user = new IndyaDto();
        user.setIndyaId("indya2025");
        user.setUserName("Sanjana");
        user.setEmail("sanjana@indya.com");
        user.setPassword("indya@2025");
        user.setConfirmPassword("indya@2025");
        user.setContactNumber(9876745678L);

        System.out.println(user);
    }
}
