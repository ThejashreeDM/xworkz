package com.xworkz.tostring.zalando;

public class ZalandoRunner
{
    public static void main(String[] args) {

        ZalandoDto user = new ZalandoDto();
        user.setZalandoId("zalando2025");
        user.setUserName("Nikita");
        user.setEmail("nikita@zalando.com");
        user.setPassword("zaland@2025");
        user.setConfirmPassword("zaland@2025");
        user.setContactNumber(9876590123L);

        System.out.println(user);
    }
}
