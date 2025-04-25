package com.xworkz.tostring.alibaba;

public class AlibabaRunner
{
    public static void main(String[] args) {


        AlibabaDto user = new AlibabaDto();
        user.setAlibabaId("alibaba2025");
        user.setUserName("Manoj");
        user.setEmail("manoj@alibaba.com");
        user.setPassword("aliba@2025");
        user.setConfirmPassword("aliba@2025");
        user.setContactNumber(9876601234L);

        AlibabaDto user1 = new AlibabaDto();
        user1.setAlibabaId("alibaba2025");
        user1.setUserName("Manoj");
        user1.setEmail("manoj@alibaba.com");
        user1.setPassword("aliba@2025");
        user1.setConfirmPassword("aliba@2025");
        user1.setContactNumber(9876601234L);

        AlibabaDto user2 = new AlibabaDto();
        user2.setAlibabaId("alibaba2024");
        user2.setUserName("Revanesh");
        user2.setEmail("rev@alibaba.com");
        user2.setPassword("aliba@2024");
        user2.setConfirmPassword("aliba@2024");
        user2.setContactNumber(9823451234L);


        System.out.println(user);
        System.out.println(user.equals(user1));
        System.out.println(user1.equals(user2));
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
}
}
