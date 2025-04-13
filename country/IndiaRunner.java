package com.xworkz.inheritancemodule.country;

public class IndiaRunner
{
    public static void main(String[] args) {
        Country country=new India();
        India type=(India)country;
        type.toLive();
    }
}
