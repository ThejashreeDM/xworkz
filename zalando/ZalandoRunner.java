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

        ZalandoDto user1 = new ZalandoDto();
        user1.setZalandoId("zalando2025");
        user1.setUserName("Nikita");
        user1.setEmail("nikita@zalando.com");
        user1.setPassword("zaland@2025");
        user1.setConfirmPassword("zaland@2025");
        user1.setContactNumber(9876590123L);

        ZalandoDto user2 = new ZalandoDto();
        user2.setZalandoId("zalando2025");
        user2.setUserName("Nikita");
        user2.setEmail("nikita@zalando.com");
        user2.setPassword("zaland@2025");
        user2.setConfirmPassword("zaland@2025");
        user2.setContactNumber(9876590123L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}
