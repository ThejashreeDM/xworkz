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

        IndyaDto user1 = new IndyaDto();
        user1.setIndyaId("indya2025");
        user1.setUserName("Sanjana");
        user1.setEmail("sanjana@indya.com");
        user1.setPassword("indya@2025");
        user1.setConfirmPassword("indya@2025");
        user1.setContactNumber(9876745678L);

        IndyaDto user2 = new IndyaDto();
        user2.setIndyaId("indya2025");
        user2.setUserName("Samrudha");
        user2.setEmail("samrudha@indya.com");
        user2.setPassword("indya@2025");
        user2.setConfirmPassword("indya@2025");
        user2.setContactNumber(9873945678L);

        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
    }
}
