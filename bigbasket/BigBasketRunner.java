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

        BigBasketDto user1 = new BigBasketDto();
        user1.setBigbasketId("bigbasket2025");
        user1.setUserName("Riya");
        user1.setEmail("riya@bigbasket.com");
        user1.setPassword("big@2025");
        user1.setConfirmPassword("big@2025");
        user1.setContactNumber(9876589012L);

        BigBasketDto user2 = new BigBasketDto();
        user2.setBigbasketId("bigbasket2027");
        user2.setUserName("Diya");
        user2.setEmail("diya@bigbasket.com");
        user2.setPassword("big@2027");
        user2.setConfirmPassword("big@2027");
        user2.setContactNumber(9253878903L);



        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}
