package com.xworkz.inheritancemodule.day;

public class MondayRunner
{
    public static void main(String[] args) {
        Day day=new Monday();
        Monday type=(Monday)day;
        day.identifyDay();
    }
}
