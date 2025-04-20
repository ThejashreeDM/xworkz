package com.xworkz.inheritancemodule.season;

public class SummarRunner
{
    public static void main(String[] args) {
        Season season = new Season();
        Season summerSeason = new Summar();
        Summar summar = new Summar();
        season.variations();
        season.start();
        season.end();
        season.changeWeather();
        season.bringFestivities();
        season.affectAgriculture();
        summerSeason.variations();
        summerSeason.start();
        summerSeason.end();
        summerSeason.changeWeather();
        summerSeason.bringFestivities();
        summerSeason.affectAgriculture();
        summar.increaseTemperature();
        summar.provideSunshine();
        summar.promoteOutdoorActivities();
        summar.causeDrought();
        summar.offerCoolingSolutions();
    }
}
