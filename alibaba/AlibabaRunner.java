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

        System.out.println(user);
}
}
